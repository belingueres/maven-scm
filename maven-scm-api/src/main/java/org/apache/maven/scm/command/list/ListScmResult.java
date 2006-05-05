package org.apache.maven.scm.command.list;

/*
 * Copyright 2001-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.ArrayList;
import java.util.List;

import org.apache.maven.scm.ScmResult;
import org.apache.maven.scm.provider.ScmProvider;

/**
 * Result of {@link ScmProvider#list} operation
 * 
 * @author <a href="mailto:carlos@apache.org">Carlos Sanchez</a>
 * @version $Id$
 */
public class ListScmResult
    extends ScmResult
{
    private List files;

    public ListScmResult( String commandLine, String providerMessage, String commandOutput, boolean success )
    {
        super( commandLine, providerMessage, commandOutput, success );

        files = new ArrayList( 0 );
    }

    public ListScmResult( String commandLine, List files )
    {
        super( commandLine, null, null, true );

        this.files = files;
    }

    public ListScmResult( List files, ScmResult result )
    {
        super( result );

        this.files = files;
    }

    public List getFiles()
    {
        return files;
    }

}