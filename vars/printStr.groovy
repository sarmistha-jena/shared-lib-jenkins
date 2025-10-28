def call(String name = "Alice"){
    script{
        sh """
            echo Printing... ${name}
        """
    }
}