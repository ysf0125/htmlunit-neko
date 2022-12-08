/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sourceforge.htmlunit.html.dom;

import org.w3c.dom.html.HTMLMetaElement;

/**
 * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a>
 * @see org.w3c.dom.html.HTMLMetaElement
 * @see net.sourceforge.htmlunit.xerces.dom.ElementImpl
 */
public class HTMLMetaElementImpl
    extends HTMLElementImpl
    implements HTMLMetaElement
{

    @Override
    public String getContent()
    {
        return getAttribute( "content" );
    }


    @Override
    public void setContent( String content )
    {
        setAttribute( "content", content );
    }



      @Override
    public String getHttpEquiv()
    {
        return getAttribute( "http-equiv" );
    }


    @Override
    public void setHttpEquiv( String httpEquiv )
    {
        setAttribute( "http-equiv", httpEquiv );
    }


      @Override
    public String getName()
    {
        return getAttribute( "name" );
    }


    @Override
    public void setName( String name )
    {
        setAttribute( "name", name );
    }


      @Override
    public String getScheme()
    {
        return getAttribute( "scheme" );
    }


    @Override
    public void setScheme( String scheme )
    {
        setAttribute( "scheme", scheme );
    }


    /**
     * Constructor requires owner document.
     *
     * @param owner The owner HTML document
     */
    public HTMLMetaElementImpl( HTMLDocumentImpl owner, String name )
    {
        super( owner, name );
    }


}

