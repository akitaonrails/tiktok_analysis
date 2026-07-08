package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyText extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyText(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearAnimInfo() {
        NLEEditorJniJNI.NLEStyText_clearAnimInfo(this.swigCPtr, this);
    }

    public void clearFallbackFontList() {
        NLEEditorJniJNI.NLEStyText_clearFallbackFontList(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyText_clone = NLEEditorJniJNI.NLEStyText_clone(this.swigCPtr, this);
        if (jNLEStyText_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyText_clone, true);
    }

    public int getAlignType() {
        return NLEEditorJniJNI.NLEStyText_getAlignType(this.swigCPtr, this);
    }

    public VecNLEStyStickerAnim getAnimInfos() {
        return new VecNLEStyStickerAnim(NLEEditorJniJNI.NLEStyText_getAnimInfos(this.swigCPtr, this), true);
    }

    public boolean getBackground() {
        return NLEEditorJniJNI.NLEStyText_getBackground(this.swigCPtr, this);
    }

    public long getBackgroundColor() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundColor(this.swigCPtr, this);
    }

    public VecFloat getBackgroundColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getBackgroundColorVector(this.swigCPtr, this), true);
    }

    public float getBackgroundHeight() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundHeight(this.swigCPtr, this);
    }

    public float getBackgroundHorizontalOffset() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundHorizontalOffset(this.swigCPtr, this);
    }

    public boolean getBackgroundRoundCorner() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundRoundCorner(this.swigCPtr, this);
    }

    public float getBackgroundRoundRadius() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundRoundRadius(this.swigCPtr, this);
    }

    public float getBackgroundRoundRadiusScale() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundRoundRadiusScale(this.swigCPtr, this);
    }

    public float getBackgroundVerticalOffset() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundVerticalOffset(this.swigCPtr, this);
    }

    public float getBackgroundWidth() {
        return NLEEditorJniJNI.NLEStyText_getBackgroundWidth(this.swigCPtr, this);
    }

    public boolean getBold() {
        return NLEEditorJniJNI.NLEStyText_getBold(this.swigCPtr, this);
    }

    public float getBoldWidth() {
        return NLEEditorJniJNI.NLEStyText_getBoldWidth(this.swigCPtr, this);
    }

    public float getCharSpacing() {
        return NLEEditorJniJNI.NLEStyText_getCharSpacing(this.swigCPtr, this);
    }

    public NLEResourceNode getFallbackFont() {
        long jNLEStyText_getFallbackFont = NLEEditorJniJNI.NLEStyText_getFallbackFont(this.swigCPtr, this);
        if (jNLEStyText_getFallbackFont == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyText_getFallbackFont, true);
    }

    public VecNLEResourceNodeSPtr getFallbackFontLists() {
        return new VecNLEResourceNodeSPtr(NLEEditorJniJNI.NLEStyText_getFallbackFontLists(this.swigCPtr, this), true);
    }

    public float getFloatFontSize() {
        return NLEEditorJniJNI.NLEStyText_getFloatFontSize(this.swigCPtr, this);
    }

    public NLEResourceNode getFlower() {
        long jNLEStyText_getFlower = NLEEditorJniJNI.NLEStyText_getFlower(this.swigCPtr, this);
        if (jNLEStyText_getFlower == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyText_getFlower, true);
    }

    public NLEResourceNode getFont() {
        long jNLEStyText_getFont = NLEEditorJniJNI.NLEStyText_getFont(this.swigCPtr, this);
        if (jNLEStyText_getFont == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyText_getFont, true);
    }

    public long getFontSize() {
        return NLEEditorJniJNI.NLEStyText_getFontSize(this.swigCPtr, this);
    }

    public float getInnerPadding() {
        return NLEEditorJniJNI.NLEStyText_getInnerPadding(this.swigCPtr, this);
    }

    public long getItalicDegree() {
        return NLEEditorJniJNI.NLEStyText_getItalicDegree(this.swigCPtr, this);
    }

    public long getKTVColor() {
        return NLEEditorJniJNI.NLEStyText_getKTVColor(this.swigCPtr, this);
    }

    public VecFloat getKTVColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getKTVColorVector(this.swigCPtr, this), true);
    }

    public long getKTVOutlineColor() {
        return NLEEditorJniJNI.NLEStyText_getKTVOutlineColor(this.swigCPtr, this);
    }

    public VecFloat getKTVOutlineColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getKTVOutlineColorVector(this.swigCPtr, this), true);
    }

    public long getKTVShadowColor() {
        return NLEEditorJniJNI.NLEStyText_getKTVShadowColor(this.swigCPtr, this);
    }

    public VecFloat getKTVShadowColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getKTVShadowColorVector(this.swigCPtr, this), true);
    }

    public float getLineGap() {
        return NLEEditorJniJNI.NLEStyText_getLineGap(this.swigCPtr, this);
    }

    public float getLineMaxWidth() {
        return NLEEditorJniJNI.NLEStyText_getLineMaxWidth(this.swigCPtr, this);
    }

    public boolean getOneLineTruncated() {
        return NLEEditorJniJNI.NLEStyText_getOneLineTruncated(this.swigCPtr, this);
    }

    public boolean getOutline() {
        return NLEEditorJniJNI.NLEStyText_getOutline(this.swigCPtr, this);
    }

    public long getOutlineColor() {
        return NLEEditorJniJNI.NLEStyText_getOutlineColor(this.swigCPtr, this);
    }

    public VecFloat getOutlineColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getOutlineColorVector(this.swigCPtr, this), true);
    }

    public float getOutlineWidth() {
        return NLEEditorJniJNI.NLEStyText_getOutlineWidth(this.swigCPtr, this);
    }

    public boolean getShadow() {
        return NLEEditorJniJNI.NLEStyText_getShadow(this.swigCPtr, this);
    }

    public long getShadowColor() {
        return NLEEditorJniJNI.NLEStyText_getShadowColor(this.swigCPtr, this);
    }

    public VecFloat getShadowColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getShadowColorVector(this.swigCPtr, this), true);
    }

    public float getShadowOffsetX() {
        return NLEEditorJniJNI.NLEStyText_getShadowOffsetX(this.swigCPtr, this);
    }

    public float getShadowOffsetY() {
        return NLEEditorJniJNI.NLEStyText_getShadowOffsetY(this.swigCPtr, this);
    }

    public float getShadowSmoothing() {
        return NLEEditorJniJNI.NLEStyText_getShadowSmoothing(this.swigCPtr, this);
    }

    public NLEResourceNode getShape() {
        long jNLEStyText_getShape = NLEEditorJniJNI.NLEStyText_getShape(this.swigCPtr, this);
        if (jNLEStyText_getShape == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEStyText_getShape, true);
    }

    public boolean getShapeFlipX() {
        return NLEEditorJniJNI.NLEStyText_getShapeFlipX(this.swigCPtr, this);
    }

    public boolean getShapeFlipY() {
        return NLEEditorJniJNI.NLEStyText_getShapeFlipY(this.swigCPtr, this);
    }

    public long getTextColor() {
        return NLEEditorJniJNI.NLEStyText_getTextColor(this.swigCPtr, this);
    }

    public VecFloat getTextColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getTextColorVector(this.swigCPtr, this), true);
    }

    public boolean getTextLocale() {
        return NLEEditorJniJNI.NLEStyText_getTextLocale(this.swigCPtr, this);
    }

    public String getTruncatedPostfix() {
        return NLEEditorJniJNI.NLEStyText_getTruncatedPostfix(this.swigCPtr, this);
    }

    public int getTypeSettingKind() {
        return NLEEditorJniJNI.NLEStyText_getTypeSettingKind(this.swigCPtr, this);
    }

    public boolean getUnderline() {
        return NLEEditorJniJNI.NLEStyText_getUnderline(this.swigCPtr, this);
    }

    public float getUnderlineOffset() {
        return NLEEditorJniJNI.NLEStyText_getUnderlineOffset(this.swigCPtr, this);
    }

    public float getUnderlineWidth() {
        return NLEEditorJniJNI.NLEStyText_getUnderlineWidth(this.swigCPtr, this);
    }

    public boolean getUseFlowerDefaultColor() {
        return NLEEditorJniJNI.NLEStyText_getUseFlowerDefaultColor(this.swigCPtr, this);
    }

    public VecFloat getUseFlowerDefaultColorVector() {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_getUseFlowerDefaultColorVector(this.swigCPtr, this), true);
    }

    public boolean hasAlignType() {
        return NLEEditorJniJNI.NLEStyText_hasAlignType(this.swigCPtr, this);
    }

    public boolean hasBackground() {
        return NLEEditorJniJNI.NLEStyText_hasBackground(this.swigCPtr, this);
    }

    public boolean hasBackgroundColor() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundColor(this.swigCPtr, this);
    }

    public boolean hasBackgroundHeight() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundHeight(this.swigCPtr, this);
    }

    public boolean hasBackgroundHorizontalOffset() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundHorizontalOffset(this.swigCPtr, this);
    }

    public boolean hasBackgroundRoundCorner() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundRoundCorner(this.swigCPtr, this);
    }

    public boolean hasBackgroundRoundRadius() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundRoundRadius(this.swigCPtr, this);
    }

    public boolean hasBackgroundRoundRadiusScale() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundRoundRadiusScale(this.swigCPtr, this);
    }

    public boolean hasBackgroundVerticalOffset() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundVerticalOffset(this.swigCPtr, this);
    }

    public boolean hasBackgroundWidth() {
        return NLEEditorJniJNI.NLEStyText_hasBackgroundWidth(this.swigCPtr, this);
    }

    public boolean hasBold() {
        return NLEEditorJniJNI.NLEStyText_hasBold(this.swigCPtr, this);
    }

    public boolean hasBoldWidth() {
        return NLEEditorJniJNI.NLEStyText_hasBoldWidth(this.swigCPtr, this);
    }

    public boolean hasCharSpacing() {
        return NLEEditorJniJNI.NLEStyText_hasCharSpacing(this.swigCPtr, this);
    }

    public boolean hasFloatFontSize() {
        return NLEEditorJniJNI.NLEStyText_hasFloatFontSize(this.swigCPtr, this);
    }

    public boolean hasFontSize() {
        return NLEEditorJniJNI.NLEStyText_hasFontSize(this.swigCPtr, this);
    }

    public boolean hasInnerPadding() {
        return NLEEditorJniJNI.NLEStyText_hasInnerPadding(this.swigCPtr, this);
    }

    public boolean hasItalicDegree() {
        return NLEEditorJniJNI.NLEStyText_hasItalicDegree(this.swigCPtr, this);
    }

    public boolean hasKTVColor() {
        return NLEEditorJniJNI.NLEStyText_hasKTVColor(this.swigCPtr, this);
    }

    public boolean hasKTVOutlineColor() {
        return NLEEditorJniJNI.NLEStyText_hasKTVOutlineColor(this.swigCPtr, this);
    }

    public boolean hasKTVShadowColor() {
        return NLEEditorJniJNI.NLEStyText_hasKTVShadowColor(this.swigCPtr, this);
    }

    public boolean hasLineGap() {
        return NLEEditorJniJNI.NLEStyText_hasLineGap(this.swigCPtr, this);
    }

    public boolean hasLineMaxWidth() {
        return NLEEditorJniJNI.NLEStyText_hasLineMaxWidth(this.swigCPtr, this);
    }

    public boolean hasOneLineTruncated() {
        return NLEEditorJniJNI.NLEStyText_hasOneLineTruncated(this.swigCPtr, this);
    }

    public boolean hasOutline() {
        return NLEEditorJniJNI.NLEStyText_hasOutline(this.swigCPtr, this);
    }

    public boolean hasOutlineColor() {
        return NLEEditorJniJNI.NLEStyText_hasOutlineColor(this.swigCPtr, this);
    }

    public boolean hasOutlineWidth() {
        return NLEEditorJniJNI.NLEStyText_hasOutlineWidth(this.swigCPtr, this);
    }

    public boolean hasShadow() {
        return NLEEditorJniJNI.NLEStyText_hasShadow(this.swigCPtr, this);
    }

    public boolean hasShadowColor() {
        return NLEEditorJniJNI.NLEStyText_hasShadowColor(this.swigCPtr, this);
    }

    public boolean hasShadowOffsetX() {
        return NLEEditorJniJNI.NLEStyText_hasShadowOffsetX(this.swigCPtr, this);
    }

    public boolean hasShadowOffsetY() {
        return NLEEditorJniJNI.NLEStyText_hasShadowOffsetY(this.swigCPtr, this);
    }

    public boolean hasShadowSmoothing() {
        return NLEEditorJniJNI.NLEStyText_hasShadowSmoothing(this.swigCPtr, this);
    }

    public boolean hasShapeFlipX() {
        return NLEEditorJniJNI.NLEStyText_hasShapeFlipX(this.swigCPtr, this);
    }

    public boolean hasShapeFlipY() {
        return NLEEditorJniJNI.NLEStyText_hasShapeFlipY(this.swigCPtr, this);
    }

    public boolean hasTextColor() {
        return NLEEditorJniJNI.NLEStyText_hasTextColor(this.swigCPtr, this);
    }

    public boolean hasTextLocale() {
        return NLEEditorJniJNI.NLEStyText_hasTextLocale(this.swigCPtr, this);
    }

    public boolean hasTruncatedPostfix() {
        return NLEEditorJniJNI.NLEStyText_hasTruncatedPostfix(this.swigCPtr, this);
    }

    public boolean hasTypeSettingKind() {
        return NLEEditorJniJNI.NLEStyText_hasTypeSettingKind(this.swigCPtr, this);
    }

    public boolean hasUnderline() {
        return NLEEditorJniJNI.NLEStyText_hasUnderline(this.swigCPtr, this);
    }

    public boolean hasUnderlineOffset() {
        return NLEEditorJniJNI.NLEStyText_hasUnderlineOffset(this.swigCPtr, this);
    }

    public boolean hasUnderlineWidth() {
        return NLEEditorJniJNI.NLEStyText_hasUnderlineWidth(this.swigCPtr, this);
    }

    public boolean hasUseFlowerDefaultColor() {
        return NLEEditorJniJNI.NLEStyText_hasUseFlowerDefaultColor(this.swigCPtr, this);
    }

    public String toEffectJsonString() {
        return NLEEditorJniJNI.NLEStyText_toEffectJsonString(this.swigCPtr, this);
    }

    public NLEStyText() {
        this(NLEEditorJniJNI.new_NLEStyText__SWIG_0(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public NLEStyText(String str) {
        this(NLEEditorJniJNI.new_NLEStyText__SWIG_1(str), true);
    }

    public static VecFloat ARGB2RGBA(long j) {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_ARGB2RGBA(j), true);
    }

    public static int ARGB2RGBInt(long j) {
        return NLEEditorJniJNI.NLEStyText_ARGB2RGBInt(j);
    }

    public static long RGBA2ARGB(VecFloat vecFloat) {
        return NLEEditorJniJNI.NLEStyText_RGBA2ARGB(VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public static String argb2hex(long j) {
        return NLEEditorJniJNI.NLEStyText_argb2hex(j);
    }

    public static NLEStyText dynamicCast(NLENode nLENode) {
        long jNLEStyText_dynamicCast = NLEEditorJniJNI.NLEStyText_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyText_dynamicCast == 0) {
            return null;
        }
        return new NLEStyText(jNLEStyText_dynamicCast, true);
    }

    public static long getCPtr(NLEStyText nLEStyText) {
        if (nLEStyText == null) {
            return 0L;
        }
        return nLEStyText.swigCPtr;
    }

    public static String rgbaArray2RgbHex(VecFloat vecFloat) {
        return NLEEditorJniJNI.NLEStyText_rgbaArray2RgbHex(VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public static String rgbaArray2hex(VecFloat vecFloat) {
        return NLEEditorJniJNI.NLEStyText_rgbaArray2hex(VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public static VecFloat strToRGB(String str) {
        return new VecFloat(NLEEditorJniJNI.NLEStyText_strToRGB(str), true);
    }

    public void addAnimInfo(NLEStyStickerAnim nLEStyStickerAnim) {
        NLEEditorJniJNI.NLEStyText_addAnimInfo(this.swigCPtr, this, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
    }

    public void addFallbackFontList(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyText_addFallbackFontList(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public boolean removeAnimInfo(NLEStyStickerAnim nLEStyStickerAnim) {
        return NLEEditorJniJNI.NLEStyText_removeAnimInfo(this.swigCPtr, this, NLEStyStickerAnim.getCPtr(nLEStyStickerAnim), nLEStyStickerAnim);
    }

    public boolean removeFallbackFontList(NLEResourceNode nLEResourceNode) {
        return NLEEditorJniJNI.NLEStyText_removeFallbackFontList(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setAlignType(int i) {
        NLEEditorJniJNI.NLEStyText_setAlignType(this.swigCPtr, this, i);
    }

    public void setBackground(boolean z) {
        NLEEditorJniJNI.NLEStyText_setBackground(this.swigCPtr, this, z);
    }

    public void setBackgroundColor(long j) {
        NLEEditorJniJNI.NLEStyText_setBackgroundColor(this.swigCPtr, this, j);
    }

    public void setBackgroundColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setBackgroundColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setBackgroundHeight(float f) {
        NLEEditorJniJNI.NLEStyText_setBackgroundHeight(this.swigCPtr, this, f);
    }

    public void setBackgroundHorizontalOffset(float f) {
        NLEEditorJniJNI.NLEStyText_setBackgroundHorizontalOffset(this.swigCPtr, this, f);
    }

    public void setBackgroundRoundCorner(boolean z) {
        NLEEditorJniJNI.NLEStyText_setBackgroundRoundCorner(this.swigCPtr, this, z);
    }

    public void setBackgroundRoundRadius(float f) {
        NLEEditorJniJNI.NLEStyText_setBackgroundRoundRadius(this.swigCPtr, this, f);
    }

    public void setBackgroundRoundRadiusScale(float f) {
        NLEEditorJniJNI.NLEStyText_setBackgroundRoundRadiusScale(this.swigCPtr, this, f);
    }

    public void setBackgroundVerticalOffset(float f) {
        NLEEditorJniJNI.NLEStyText_setBackgroundVerticalOffset(this.swigCPtr, this, f);
    }

    public void setBackgroundWidth(float f) {
        NLEEditorJniJNI.NLEStyText_setBackgroundWidth(this.swigCPtr, this, f);
    }

    public void setBold(boolean z) {
        NLEEditorJniJNI.NLEStyText_setBold(this.swigCPtr, this, z);
    }

    public void setBoldWidth(float f) {
        NLEEditorJniJNI.NLEStyText_setBoldWidth(this.swigCPtr, this, f);
    }

    public void setCharSpacing(float f) {
        NLEEditorJniJNI.NLEStyText_setCharSpacing(this.swigCPtr, this, f);
    }

    public void setFallbackFont(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyText_setFallbackFont(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setFloatFontSize(float f) {
        NLEEditorJniJNI.NLEStyText_setFloatFontSize(this.swigCPtr, this, f);
    }

    public void setFlower(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyText_setFlower(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setFont(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyText_setFont(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setFontSize(long j) {
        NLEEditorJniJNI.NLEStyText_setFontSize(this.swigCPtr, this, j);
    }

    public void setInnerPadding(float f) {
        NLEEditorJniJNI.NLEStyText_setInnerPadding(this.swigCPtr, this, f);
    }

    public void setItalicDegree(long j) {
        NLEEditorJniJNI.NLEStyText_setItalicDegree(this.swigCPtr, this, j);
    }

    public void setKTVColor(long j) {
        NLEEditorJniJNI.NLEStyText_setKTVColor(this.swigCPtr, this, j);
    }

    public void setKTVColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setKTVColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setKTVOutlineColor(long j) {
        NLEEditorJniJNI.NLEStyText_setKTVOutlineColor(this.swigCPtr, this, j);
    }

    public void setKTVOutlineColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setKTVOutlineColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setKTVShadowColor(long j) {
        NLEEditorJniJNI.NLEStyText_setKTVShadowColor(this.swigCPtr, this, j);
    }

    public void setKTVShadowColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setKTVShadowColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setLineGap(float f) {
        NLEEditorJniJNI.NLEStyText_setLineGap(this.swigCPtr, this, f);
    }

    public void setLineMaxWidth(float f) {
        NLEEditorJniJNI.NLEStyText_setLineMaxWidth(this.swigCPtr, this, f);
    }

    public void setOneLineTruncated(boolean z) {
        NLEEditorJniJNI.NLEStyText_setOneLineTruncated(this.swigCPtr, this, z);
    }

    public void setOutline(boolean z) {
        NLEEditorJniJNI.NLEStyText_setOutline(this.swigCPtr, this, z);
    }

    public void setOutlineColor(long j) {
        NLEEditorJniJNI.NLEStyText_setOutlineColor(this.swigCPtr, this, j);
    }

    public void setOutlineColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setOutlineColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setOutlineWidth(float f) {
        NLEEditorJniJNI.NLEStyText_setOutlineWidth(this.swigCPtr, this, f);
    }

    public void setShadow(boolean z) {
        NLEEditorJniJNI.NLEStyText_setShadow(this.swigCPtr, this, z);
    }

    public void setShadowColor(long j) {
        NLEEditorJniJNI.NLEStyText_setShadowColor(this.swigCPtr, this, j);
    }

    public void setShadowColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setShadowColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setShadowOffsetX(float f) {
        NLEEditorJniJNI.NLEStyText_setShadowOffsetX(this.swigCPtr, this, f);
    }

    public void setShadowOffsetY(float f) {
        NLEEditorJniJNI.NLEStyText_setShadowOffsetY(this.swigCPtr, this, f);
    }

    public void setShadowSmoothing(float f) {
        NLEEditorJniJNI.NLEStyText_setShadowSmoothing(this.swigCPtr, this, f);
    }

    public void setShape(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEStyText_setShape(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setShapeFlipX(boolean z) {
        NLEEditorJniJNI.NLEStyText_setShapeFlipX(this.swigCPtr, this, z);
    }

    public void setShapeFlipY(boolean z) {
        NLEEditorJniJNI.NLEStyText_setShapeFlipY(this.swigCPtr, this, z);
    }

    public void setTextColor(long j) {
        NLEEditorJniJNI.NLEStyText_setTextColor(this.swigCPtr, this, j);
    }

    public void setTextColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setTextColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setTextLocale(boolean z) {
        NLEEditorJniJNI.NLEStyText_setTextLocale(this.swigCPtr, this, z);
    }

    public void setTruncatedPostfix(String str) {
        NLEEditorJniJNI.NLEStyText_setTruncatedPostfix(this.swigCPtr, this, str);
    }

    public void setTypeSettingKind(int i) {
        NLEEditorJniJNI.NLEStyText_setTypeSettingKind(this.swigCPtr, this, i);
    }

    public void setUnderline(boolean z) {
        NLEEditorJniJNI.NLEStyText_setUnderline(this.swigCPtr, this, z);
    }

    public void setUnderlineOffset(float f) {
        NLEEditorJniJNI.NLEStyText_setUnderlineOffset(this.swigCPtr, this, f);
    }

    public void setUnderlineWidth(float f) {
        NLEEditorJniJNI.NLEStyText_setUnderlineWidth(this.swigCPtr, this, f);
    }

    public void setUseFlowerDefaultColor(boolean z) {
        NLEEditorJniJNI.NLEStyText_setUseFlowerDefaultColor(this.swigCPtr, this, z);
    }

    public void setUseFlowerDefaultColorVector(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEStyText_setUseFlowerDefaultColorVector(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void supportMoreColor(boolean z) {
        NLEEditorJniJNI.NLEStyText_supportMoreColor(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyText(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyText_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
