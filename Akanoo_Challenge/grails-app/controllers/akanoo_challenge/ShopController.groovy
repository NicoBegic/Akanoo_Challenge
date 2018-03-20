package akanoo_challenge

class ShopController {

    def index(){
        redirect (action: "shopList")
    }

    def shopList(){
        //Directs to the view shopList
        def shops = Shop.list()
        [shops:shops]
    }
}
