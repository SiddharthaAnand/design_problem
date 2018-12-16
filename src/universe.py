import southeros_kingdom

class Universe(object):

	def __init__(self, kingdoms):
		self.kingdoms = kingdoms
		self.ruler = None

	def current_ruler(self):
		return self.ruler

	def current_ruler_emblem(self):
		return self.ruler.kingdom.emblem

	def total_kingdoms(self):
		pass

	def create_kingdom(self, name, emblem):
		
	def run_it(self):

	
if __name__ == '__main__':
	universe = Universe({"LAND": "PANDA", 
							"WATER": "OCTOPUS", 
							"ICE":"MAMMOTH", 
							"AIR":"OWL", 
							"FIRE": "DRAGON", 
							"SPACE":"GORILLA"
							})


