
<!-- grails-app/views/supplier/_supplierList.gsp -->
<ul class="list">
    <g:each in="${suppliers?}" var="supplier">
        <li class="icon">
            <g:link controller="suppliers" action="TBDshow">
                <g:img dir="images/icons" file="artist.png" />
                ${supplier?.name}
            </g:link>
        </li>
    </g:each>
</ul>