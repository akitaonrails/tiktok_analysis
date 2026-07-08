package com.bytedance.xelement.markdown;

import X.C1315330kKh;
import X.InterfaceC1311410kEN;
import android.graphics.RectF;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class MarkdownLinkExposureUI extends LynxFlattenUI {
    public final String LL;
    public final C1315330kKh LLILLJJLI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean getEnableExposureUIMargin() {
        return getExposeReceiveTarget().getEnableExposureUIMargin();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final LynxBaseUI getExposeReceiveTarget() {
        return getParentBaseUI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getExposureScreenMarginBottom() {
        return getExposeReceiveTarget().getExposureScreenMarginBottom();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getExposureScreenMarginLeft() {
        return getExposeReceiveTarget().getExposureScreenMarginLeft();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getExposureScreenMarginRight() {
        return getExposeReceiveTarget().getExposureScreenMarginRight();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getExposureScreenMarginTop() {
        return getExposeReceiveTarget().getExposureScreenMarginTop();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final String getExposeUniqueID() {
        return this.LL;
    }

    public MarkdownLinkExposureUI(s sVar, C1315330kKh c1315330kKh, String str) {
        super(sVar);
        this.LL = str;
        this.LLILLJJLI = c1315330kKh;
        RectF rectF = c1315330kKh.LIZLLL;
        setWidth((int) rectF.width());
        setHeight((int) rectF.height());
        setTop((int) rectF.top);
        setLeft((int) rectF.left);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2, boolean z) {
        return getExposeReceiveTarget();
    }
}
