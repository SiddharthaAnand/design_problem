import general_store

class Kingdom(object):

	def __init__(self, name, emblem):
		self.name = name
		self.emblem = emblem
		self.secret_message = None
		self.deciphered_message = None
		self.reply = None
		self.toolbox = general_store.GeneralStore()

	def get_name(self):
		return self.name

	def get_emblem(self):
		return self.emblem

	def receive_msg(self, secret_message):
		self.secret_message = secret_message

	def decipher_msg(self, secret_message):
		self.reply = self.toolbox.message_decoder(secret_message)

	def send_reply(self):
		return self.reply
		