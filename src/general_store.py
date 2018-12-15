class GeneralStore(object):
	def __init__(self):
		self.deciphered_message = None
		self.emblem_frequency_store = None
		self.message_frequency_store = None

	def store_frequency(self, storage, message):
		if storage == "emblem":
			for val in message:
				if val not in self.emblem_frequency_store:
					self.emblem_frequency_store[val] = 1
				else:
					self.emblem_frequency_store[val] += 1
		else:
			for val in message:
				if val not in self.message_frequency_store:
					self.message_frequency_store[val] = 1
				else:
					self.message_frequency_store[val] += 1

	def message_decoder(self, kingdom, message):
		emblem = kingdom.get_emblem()
		friend = True
		store_frequency("emblem", message)
		store_frequency("message", message)
		
		for val in self.emblem_frequency_store:
			if val in self.message_frequency_store and self.emblem_frequency_store[val] == self.message_frequency_store[val]:
				continue
			else:
				friend = False

		if friend:
			self.deciphered_message = "I SUPPORT YOU"
		else:
			self.deciphered_message = "I DO NOT SUPPORT YOU"

		return self.deciphered_message

