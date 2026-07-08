package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes4.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    byte[] getAsArrayBuffer();

    String getAsString();

    int getType();
}
