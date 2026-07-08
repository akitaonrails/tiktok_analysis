package com.facebook.yoga;

import X.C0WLV;
import X.C14Q9;
import X.C14QE;
import X.C14QF;
import X.C14QI;
import X.C14QJ;
import X.C14QL;
import X.C21334418eM;
import X.EnumC1321440kUY;
import X.EnumC21334618eO;
import X.InterfaceC21331218dq;
import X.InterfaceC21339118f7;

/* JADX INFO: loaded from: classes33.dex */
public abstract class m {
    public abstract void addChildAt(m mVar, int i);

    public abstract void calculateLayout(float f, float f2);

    public abstract m cloneWithChildren();

    public abstract m cloneWithoutChildren();

    public abstract void copyStyle(m mVar);

    public abstract void dirty();

    public abstract C14QJ getAlignContent();

    public abstract C14QJ getAlignItems();

    public abstract C14QJ getAlignSelf();

    public abstract float getAspectRatio();

    public abstract float getBorder(EnumC1321440kUY enumC1321440kUY);

    public abstract m getChildAt(int i);

    public abstract int getChildCount();

    public abstract Object getData();

    public abstract C14QF getDisplay();

    public abstract float getFlex();

    public abstract C21334418eM getFlexBasis();

    public abstract C14QL getFlexDirection();

    public abstract float getFlexGrow();

    public abstract float getFlexShrink();

    public abstract C21334418eM getHeight();

    public abstract C14QI getJustifyContent();

    public abstract float getLayoutBorder(EnumC1321440kUY enumC1321440kUY);

    public abstract C0WLV getLayoutDirection();

    public abstract float getLayoutHeight();

    public abstract float getLayoutMargin(EnumC1321440kUY enumC1321440kUY);

    public abstract float getLayoutPadding(EnumC1321440kUY enumC1321440kUY);

    public abstract float getLayoutWidth();

    public abstract float getLayoutX();

    public abstract float getLayoutY();

    public abstract C21334418eM getMargin(EnumC1321440kUY enumC1321440kUY);

    public abstract C21334418eM getMaxHeight();

    public abstract C21334418eM getMaxWidth();

    public abstract C21334418eM getMinHeight();

    public abstract C21334418eM getMinWidth();

    public abstract EnumC21334618eO getOverflow();

    public abstract m getOwner();

    public abstract C21334418eM getPadding(EnumC1321440kUY enumC1321440kUY);

    public abstract m getParent();

    public abstract C21334418eM getPosition(EnumC1321440kUY enumC1321440kUY);

    public abstract C14QE getPositionType();

    public abstract C0WLV getStyleDirection();

    public abstract C21334418eM getWidth();

    public abstract C14Q9 getWrap();

    public abstract boolean hasNewLayout();

    public abstract int indexOf(m mVar);

    public abstract boolean isBaselineDefined();

    public abstract boolean isDirty();

    public abstract boolean isMeasureDefined();

    public abstract boolean isReferenceBaseline();

    public abstract void markLayoutSeen();

    public abstract void print();

    public abstract m removeChildAt(int i);

    public abstract void reset();

    public abstract void setAlignContent(C14QJ c14qj);

    public abstract void setAlignItems(C14QJ c14qj);

    public abstract void setAlignSelf(C14QJ c14qj);

    public abstract void setAspectRatio(float f);

    public abstract void setBaselineFunction(InterfaceC21339118f7 interfaceC21339118f7);

    public abstract void setBorder(EnumC1321440kUY enumC1321440kUY, float f);

    public abstract void setData(Object obj);

    public abstract void setDirection(C0WLV c0wlv);

    public abstract void setDisplay(C14QF c14qf);

    public abstract void setFlex(float f);

    public abstract void setFlexBasis(float f);

    public abstract void setFlexBasisAuto();

    public abstract void setFlexBasisPercent(float f);

    public abstract void setFlexDirection(C14QL c14ql);

    public abstract void setFlexGrow(float f);

    public abstract void setFlexShrink(float f);

    public abstract void setHeight(float f);

    public abstract void setHeightAuto();

    public abstract void setHeightPercent(float f);

    public abstract void setIsReferenceBaseline(boolean z);

    public abstract void setJustifyContent(C14QI c14qi);

    public abstract void setMargin(EnumC1321440kUY enumC1321440kUY, float f);

    public abstract void setMarginAuto(EnumC1321440kUY enumC1321440kUY);

    public abstract void setMarginPercent(EnumC1321440kUY enumC1321440kUY, float f);

    public abstract void setMaxHeight(float f);

    public abstract void setMaxHeightPercent(float f);

    public abstract void setMaxWidth(float f);

    public abstract void setMaxWidthPercent(float f);

    public abstract void setMeasureFunction(InterfaceC21331218dq interfaceC21331218dq);

    public abstract void setMinHeight(float f);

    public abstract void setMinHeightPercent(float f);

    public abstract void setMinWidth(float f);

    public abstract void setMinWidthPercent(float f);

    public abstract void setOverflow(EnumC21334618eO enumC21334618eO);

    public abstract void setPadding(EnumC1321440kUY enumC1321440kUY, float f);

    public abstract void setPaddingPercent(EnumC1321440kUY enumC1321440kUY, float f);

    public abstract void setPosition(EnumC1321440kUY enumC1321440kUY, float f);

    public abstract void setPositionPercent(EnumC1321440kUY enumC1321440kUY, float f);

    public abstract void setPositionType(C14QE c14qe);

    public abstract void setWidth(float f);

    public abstract void setWidthAuto();

    public abstract void setWidthPercent(float f);

    public abstract void setWrap(C14Q9 c14q9);
}
