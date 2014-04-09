package com.edmodo.cropper.util;

import android.graphics.Path;

/**
 * Callback interface for updating the {@link android.graphics.Path} object
 * that will be used to draw the selected crop area.
 */
public interface PathHelper {

    public void updatePath(Path path, float left, float top, float right, float bottom);
}
