
// Put your resources in here
modules = {
    overrides {
        'bootstrap-js' {
            dependsOn 'jquery'
        }
    }
    
    'theme.Bootstrap' {
        // Add your global CSS/JS files here
        dependsOn 'bootstrap-css', 'bootstrap-tabs'
        
        resource id:'styling', url:[plugin:'bootstrap-theme', dir:'css', file:'styling.css']
        resource id:'hooks', url:[plugin:'bootstrap-theme', dir:'js', file:'bootstrap-hooks.js']
    }

    'theme.Bootstrap.sidebar' {
        // Add your 'sidebar' specific CSS/JS files here
    }

    'theme.Bootstrap.report' {
        // Add your 'report' specific CSS/JS files here
    }

    'theme.Bootstrap.dataentry' {
        // Add your 'dataentry' specific CSS/JS files here
    }

    'theme.Bootstrap.form' {
        // Add your 'form' specific CSS/JS files here
    }

    'theme.Bootstrap.main' {
        // Add your 'main' specific CSS/JS files here
    }
}