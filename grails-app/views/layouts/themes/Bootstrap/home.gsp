<g:html>
    <theme:head/>
    <theme:body>
        <theme:layoutTemplate name="header"/>
        
        <div class="container">
            <div class="content">
                <div class="page-header">
                    <div class="row">
                        <div class="span14">
                            <theme:logo width="450" height="150"/>
                            <theme:layoutZone name="banner"/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="span14">
                        <theme:layoutZone name="body"/>
                    </div>
                </div>
                <div class="row">
                    <div class="span5">
                        <theme:layoutZone name="panel1"/>
                    </div>
                    <div class="span4">
                        <theme:layoutZone name="panel2"/>
                    </div>
                    <div class="span5">
                        <theme:layoutZone name="panel3"/>
                    </div>
                </div>
            </div>
            <theme:layoutTemplate name="footer"/>
        </div>
    </theme:body>
</g:html>
