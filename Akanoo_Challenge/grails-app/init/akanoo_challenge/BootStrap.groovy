package akanoo_challenge

import akanoo_challenge.Shop

class BootStrap {

    def init = { servletContext ->
        Shop.saveAll(
                new Shop(id: "1", name: "decathlon.de"),
                new Shop(id: "2", name: "getdigital.de"),
                new Shop(id: "3", name: "thalia.de")
        )
    }
    def destroy = {
    }
}
