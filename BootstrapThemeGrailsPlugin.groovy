class BootstrapThemeGrailsPlugin {
    // the plugin version
    def version = "1.0.BUILD-SNAPSHOT"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Marc Palmer"
    def authorEmail = "marc@grailsrocks.com"
    def title = "Twitter Bootstrap Theme"
    def description = '''\\
Provides a Plugin Platform Theme based on Twitter Bootstrap
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/bootstrap-theme"

    def doWithConfig = { config ->
        application {
            grails.themes.Bootstrap.ui.button.cssClass = 'btn'
            grails.themes.Bootstrap.ui.tab.cssClass = ''
            grails.themes.Bootstrap.ui.field.cssClass = 'input'
            grails.themes.Bootstrap.ui.error.cssClass = 'error'
            grails.themes.Bootstrap.ui.table.cssClass = 'zebra-striped'
            grails.themes.Bootstrap.ui.tableRow.cssClass = ''
            grails.themes.Bootstrap.ui.tableRowOdd.cssClass = ''
            grails.themes.Bootstrap.ui.tableRowEven.cssClass = ''
        }
    }
    
    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
