package com.tiktok.strategycenterengineimpl.utils;

import com.tiktok.strategycenterengine.utils.IFeedUtils;
import com.tiktok.strategycenterengine.utils.PSPFeedUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class PSPFeedUtilsDelegate implements IFeedUtils {
    @Override // com.tiktok.strategycenterengine.utils.IFeedUtils
    public final void LIZ(PSPFeedUtils pSPFeedUtils) {
        PSPFeedUtilsImpl.setInstance(pSPFeedUtils);
    }
}
