package akanoo_challenge

class ShopController {

    def index(){
        redirect (action: "shopListTest")
    }

    def shopListTest(){
        //Directs to the view shopList
        def shops = Shop.list()
        [shops:shops]
    }
}
