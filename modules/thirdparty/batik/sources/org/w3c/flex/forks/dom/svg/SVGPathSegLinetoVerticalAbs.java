
package org.w3c.flex.forks.dom.svg;

import org.w3c.dom.DOMException;

public interface SVGPathSegLinetoVerticalAbs extends 
               SVGPathSeg {
  public float   getY( );
  public void      setY( float y )
                       throws DOMException;
}
