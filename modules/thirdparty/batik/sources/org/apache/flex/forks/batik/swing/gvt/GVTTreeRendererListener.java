/*

   Copyright 2001  The Apache Software Foundation 

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.flex.forks.batik.swing.gvt;

/**
 * This interface represents a listener to the GVTTreeRendererEvent events.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id: GVTTreeRendererListener.java,v 1.3 2004/08/18 07:15:32 vhardy Exp $
 */
public interface GVTTreeRendererListener {

    /**
     * Called when a rendering is in its preparing phase.
     */
    void gvtRenderingPrepare(GVTTreeRendererEvent e);

    /**
     * Called when a rendering started.
     */
    void gvtRenderingStarted(GVTTreeRendererEvent e);

    /**
     * Called when a rendering was completed.
     */
    void gvtRenderingCompleted(GVTTreeRendererEvent e);

    /**
     * Called when a rendering was cancelled.
     */
    void gvtRenderingCancelled(GVTTreeRendererEvent e);

    /**
     * Called when a rendering failed.
     */
    void gvtRenderingFailed(GVTTreeRendererEvent e);

}
