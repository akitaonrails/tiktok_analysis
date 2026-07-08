package com.facebook.yoga;

import X.AbstractC21344318fx;
import X.AbstractC21344418fy;
import X.C0WLV;
import X.C1321450kUZ;
import X.C14Q9;
import X.C14QE;
import X.C14QF;
import X.C14QI;
import X.C14QJ;
import X.C14QL;
import X.C21334418eM;
import X.EnumC1321440kUY;
import X.EnumC1321460kUa;
import X.EnumC21334518eN;
import X.EnumC21334618eO;
import X.InterfaceC21331218dq;
import X.InterfaceC21338818f4;
import X.InterfaceC21339118f7;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public abstract class YogaNodeJNIBase extends m implements Cloneable {
    public float[] arr;
    public InterfaceC21339118f7 mBaselineFunction;
    public List<YogaNodeJNIBase> mChildren;
    public Object mData;
    public boolean mHasNewLayout;
    public int mLayoutDirection;
    public InterfaceC21331218dq mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;

    private void clearChildren() {
        this.mChildren = null;
        YogaNative.jni_YGNodeClearChildrenJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public void reset() {
        this.mMeasureFunction = null;
        this.mBaselineFunction = null;
        this.mData = null;
        this.arr = null;
        this.mHasNewLayout = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public void dirty() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.mNativePointer);
    }

    public void dirtyAllDescendants() {
        YogaNative.jni_YGNodeMarkDirtyAndPropogateToDescendantsJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public C14QJ getAlignContent() {
        return C14QJ.fromInt(YogaNative.jni_YGNodeStyleGetAlignContentJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C14QJ getAlignItems() {
        return C14QJ.fromInt(YogaNative.jni_YGNodeStyleGetAlignItemsJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C14QJ getAlignSelf() {
        return C14QJ.fromInt(YogaNative.jni_YGNodeStyleGetAlignSelfJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public float getAspectRatio() {
        return YogaNative.jni_YGNodeStyleGetAspectRatioJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public int getChildCount() {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.facebook.yoga.m
    public C14QF getDisplay() {
        return C14QF.fromInt(YogaNative.jni_YGNodeStyleGetDisplayJNI(this.mNativePointer));
    }

    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        float[] fArr = this.arr;
        return fArr != null && (((int) fArr[0]) & 8) == 8;
    }

    @Override // com.facebook.yoga.m
    public float getFlex() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getFlexBasis() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetFlexBasisJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C14QL getFlexDirection() {
        return C14QL.fromInt(YogaNative.jni_YGNodeStyleGetFlexDirectionJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public float getFlexGrow() {
        return YogaNative.jni_YGNodeStyleGetFlexGrowJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public float getFlexShrink() {
        return YogaNative.jni_YGNodeStyleGetFlexShrinkJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetHeightJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C14QI getJustifyContent() {
        return C14QI.fromInt(YogaNative.jni_YGNodeStyleGetJustifyContentJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C0WLV getLayoutDirection() {
        float[] fArr = this.arr;
        return C0WLV.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.m
    public float getLayoutHeight() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.m
    public float getLayoutWidth() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.m
    public float getLayoutX() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.m
    public float getLayoutY() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getMaxHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMaxHeightJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getMaxWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMaxWidthJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getMinHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMinHeightJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getMinWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMinWidthJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public EnumC21334618eO getOverflow() {
        return EnumC21334618eO.fromInt(YogaNative.jni_YGNodeStyleGetOverflowJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C14QE getPositionType() {
        return C14QE.fromInt(YogaNative.jni_YGNodeStyleGetPositionTypeJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C0WLV getStyleDirection() {
        return C0WLV.fromInt(YogaNative.jni_YGNodeStyleGetDirectionJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetWidthJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public C14Q9 getWrap() {
        return C14Q9.fromInt(YogaNative.jni_YGNodeStyleGetFlexWrapJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.m
    public boolean hasNewLayout() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.mHasNewLayout;
    }

    @Override // com.facebook.yoga.m
    public boolean isBaselineDefined() {
        return this.mBaselineFunction != null;
    }

    @Override // com.facebook.yoga.m
    public boolean isDirty() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public boolean isMeasureDefined() {
        return this.mMeasureFunction != null;
    }

    @Override // com.facebook.yoga.m
    public boolean isReferenceBaseline() {
        return YogaNative.jni_YGNodeIsReferenceBaselineJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public void markLayoutSeen() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.mHasNewLayout = false;
    }

    @Override // com.facebook.yoga.m
    public void print() {
        YogaNative.jni_YGNodePrintJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public void setFlexBasisAuto() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public void setHeightAuto() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public void setWidthAuto() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.mNativePointer);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.facebook.yoga.m
    public YogaNodeJNIBase cloneWithChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            if (yogaNodeJNIBase.mChildren != null) {
                yogaNodeJNIBase.mChildren = new ArrayList(yogaNodeJNIBase.mChildren);
            }
            long jJni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jJni_YGNodeCloneJNI;
            for (int i = 0; i < yogaNodeJNIBase.getChildCount(); i++) {
                yogaNodeJNIBase.swapChildAt(yogaNodeJNIBase.getChildAt(i).cloneWithChildren(), i);
            }
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.yoga.m
    public YogaNodeJNIBase cloneWithoutChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jJni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jJni_YGNodeCloneJNI;
            yogaNodeJNIBase.clearChildren();
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.yoga.m
    public YogaNodeJNIBase getParent() {
        return getOwner();
    }

    @Override // com.facebook.yoga.m
    public Object getData() {
        return this.mData;
    }

    @Override // com.facebook.yoga.m
    public YogaNodeJNIBase getOwner() {
        return this.mOwner;
    }

    public YogaNodeJNIBase(long j) {
        this.mHasNewLayout = true;
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    private void freeze(m mVar) {
        Object data = getData();
        if (data instanceof InterfaceC21338818f4) {
            ((InterfaceC21338818f4) data).freeze();
        }
    }

    public static C21334418eM valueFromLong(long j) {
        return new C21334418eM(Float.intBitsToFloat((int) j), EnumC21334518eN.fromInt((int) (j >> 32)));
    }

    @Override // com.facebook.yoga.m
    public void copyStyle(m mVar) {
        if (!(mVar instanceof YogaNodeJNIBase)) {
            return;
        }
        YogaNative.jni_YGNodeCopyStyleJNI(this.mNativePointer, ((YogaNodeJNIBase) mVar).mNativePointer);
    }

    @Override // com.facebook.yoga.m
    public float getBorder(EnumC1321440kUY enumC1321440kUY) {
        return YogaNative.jni_YGNodeStyleGetBorderJNI(this.mNativePointer, enumC1321440kUY.intValue());
    }

    @Override // com.facebook.yoga.m
    public YogaNodeJNIBase getChildAt(int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.facebook.yoga.m
    public float getLayoutBorder(EnumC1321440kUY enumC1321440kUY) {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            int i2 = 0;
            float f = fArr[0];
            if ((((int) f) & 4) == 4) {
                if ((((int) f) & 1) == 1) {
                    i = 0;
                } else {
                    i = 4;
                }
                int i3 = 14 - i;
                if ((((int) f) & 2) != 2) {
                    i2 = 4;
                }
                int i4 = i3 - i2;
                switch (C1321450kUZ.LIZ[enumC1321440kUY.ordinal()]) {
                    case 1:
                        return this.arr[i4];
                    case 2:
                        return this.arr[i4 + 1];
                    case 3:
                        return this.arr[i4 + 2];
                    case 4:
                        return this.arr[i4 + 3];
                    case 5:
                        if (getLayoutDirection() == C0WLV.RTL) {
                            return this.arr[i4 + 2];
                        }
                        return this.arr[i4];
                    case 6:
                        if (getLayoutDirection() == C0WLV.RTL) {
                            return this.arr[i4];
                        }
                        return this.arr[i4 + 2];
                    default:
                        throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
                }
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.m
    public float getLayoutMargin(EnumC1321440kUY enumC1321440kUY) {
        float[] fArr = this.arr;
        if (fArr != null && (((int) fArr[0]) & 1) == 1) {
            switch (C1321450kUZ.LIZ[enumC1321440kUY.ordinal()]) {
                case 1:
                    return this.arr[6];
                case 2:
                    return this.arr[7];
                case 3:
                    return this.arr[8];
                case 4:
                    return this.arr[9];
                case 5:
                    if (getLayoutDirection() == C0WLV.RTL) {
                        return this.arr[8];
                    }
                    return this.arr[6];
                case 6:
                    if (getLayoutDirection() == C0WLV.RTL) {
                        return this.arr[6];
                    }
                    return this.arr[8];
                default:
                    throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
            }
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.m
    public float getLayoutPadding(EnumC1321440kUY enumC1321440kUY) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            float f = fArr[0];
            if ((((int) f) & 2) == 2) {
                if ((((int) f) & 1) != 1) {
                    i = 4;
                }
                int i2 = 10 - i;
                switch (C1321450kUZ.LIZ[enumC1321440kUY.ordinal()]) {
                    case 1:
                        return this.arr[i2];
                    case 2:
                        return this.arr[i2 + 1];
                    case 3:
                        return this.arr[i2 + 2];
                    case 4:
                        return this.arr[i2 + 3];
                    case 5:
                        if (getLayoutDirection() == C0WLV.RTL) {
                            return this.arr[i2 + 2];
                        }
                        return this.arr[i2];
                    case 6:
                        if (getLayoutDirection() == C0WLV.RTL) {
                            return this.arr[i2];
                        }
                        return this.arr[i2 + 2];
                    default:
                        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
                }
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getMargin(EnumC1321440kUY enumC1321440kUY) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMarginJNI(this.mNativePointer, enumC1321440kUY.intValue()));
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getPadding(EnumC1321440kUY enumC1321440kUY) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.mNativePointer, enumC1321440kUY.intValue()));
    }

    @Override // com.facebook.yoga.m
    public C21334418eM getPosition(EnumC1321440kUY enumC1321440kUY) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetPositionJNI(this.mNativePointer, enumC1321440kUY.intValue()));
    }

    @Override // com.facebook.yoga.m
    public int indexOf(m mVar) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return -1;
        }
        return list.indexOf(mVar);
    }

    @Override // com.facebook.yoga.m
    public YogaNodeJNIBase removeChildAt(int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i);
            yogaNodeJNIBaseRemove.mOwner = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.mNativePointer, yogaNodeJNIBaseRemove.mNativePointer);
            return yogaNodeJNIBaseRemove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.facebook.yoga.m
    public void setAlignContent(C14QJ c14qj) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.mNativePointer, c14qj.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setAlignItems(C14QJ c14qj) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.mNativePointer, c14qj.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setAlignSelf(C14QJ c14qj) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.mNativePointer, c14qj.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setAspectRatio(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setBaselineFunction(InterfaceC21339118f7 interfaceC21339118f7) {
        boolean z;
        this.mBaselineFunction = interfaceC21339118f7;
        long j = this.mNativePointer;
        if (interfaceC21339118f7 != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(j, z);
    }

    @Override // com.facebook.yoga.m
    public void setData(Object obj) {
        this.mData = obj;
    }

    @Override // com.facebook.yoga.m
    public void setDirection(C0WLV c0wlv) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.mNativePointer, c0wlv.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setDisplay(C14QF c14qf) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.mNativePointer, c14qf.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setFlex(float f) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setFlexBasis(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setFlexBasisPercent(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setFlexDirection(C14QL c14ql) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.mNativePointer, c14ql.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setFlexGrow(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setFlexShrink(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setHeight(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setIsReferenceBaseline(boolean z) {
        YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(this.mNativePointer, z);
    }

    @Override // com.facebook.yoga.m
    public void setJustifyContent(C14QI c14qi) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.mNativePointer, c14qi.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setMarginAuto(EnumC1321440kUY enumC1321440kUY) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.mNativePointer, enumC1321440kUY.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setMaxHeight(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setMaxHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setMaxWidth(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setMaxWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setMeasureFunction(InterfaceC21331218dq interfaceC21331218dq) {
        boolean z;
        this.mMeasureFunction = interfaceC21331218dq;
        long j = this.mNativePointer;
        if (interfaceC21331218dq != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(j, z);
    }

    @Override // com.facebook.yoga.m
    public void setMinHeight(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setMinHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setMinWidth(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setMinWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setOverflow(EnumC21334618eO enumC21334618eO) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.mNativePointer, enumC21334618eO.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setPositionType(C14QE c14qe) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.mNativePointer, c14qe.intValue());
    }

    @Override // com.facebook.yoga.m
    public void setWidth(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.m
    public void setWrap(C14Q9 c14q9) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.mNativePointer, c14q9.intValue());
    }

    public YogaNodeJNIBase(AbstractC21344418fy abstractC21344418fy) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((AbstractC21344318fx) abstractC21344418fy).LIZ));
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.facebook.yoga.m
    public void addChildAt(m mVar, int i) {
        if (!(mVar instanceof YogaNodeJNIBase)) {
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) mVar;
        if (yogaNodeJNIBase.mOwner == null) {
            if (this.mChildren == null) {
                this.mChildren = new ArrayList(4);
            }
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public final float baseline(float f, float f2) {
        return this.mBaselineFunction.LJIIIZ(f2);
    }

    @Override // com.facebook.yoga.m
    public void calculateLayout(float f, float f2) {
        freeze(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.mChildren;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.freeze(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.mNativePointer, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.m
    public void setBorder(EnumC1321440kUY enumC1321440kUY, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.mNativePointer, enumC1321440kUY.intValue(), f);
    }

    @Override // com.facebook.yoga.m
    public void setMargin(EnumC1321440kUY enumC1321440kUY, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.mNativePointer, enumC1321440kUY.intValue(), f);
    }

    @Override // com.facebook.yoga.m
    public void setMarginPercent(EnumC1321440kUY enumC1321440kUY, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.mNativePointer, enumC1321440kUY.intValue(), f);
    }

    @Override // com.facebook.yoga.m
    public void setPadding(EnumC1321440kUY enumC1321440kUY, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.mNativePointer, enumC1321440kUY.intValue(), f);
    }

    @Override // com.facebook.yoga.m
    public void setPaddingPercent(EnumC1321440kUY enumC1321440kUY, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.mNativePointer, enumC1321440kUY.intValue(), f);
    }

    @Override // com.facebook.yoga.m
    public void setPosition(EnumC1321440kUY enumC1321440kUY, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.mNativePointer, enumC1321440kUY.intValue(), f);
    }

    @Override // com.facebook.yoga.m
    public void setPositionPercent(EnumC1321440kUY enumC1321440kUY, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.mNativePointer, enumC1321440kUY.intValue(), f);
    }

    public void swapChildAt(m mVar, int i) {
        if (!(mVar instanceof YogaNodeJNIBase)) {
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) mVar;
        this.mChildren.remove(i);
        this.mChildren.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.mOwner = this;
        YogaNative.jni_YGNodeSwapChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
    }

    public final long measure(float f, int i, float f2, int i2) {
        if (isMeasureDefined()) {
            return this.mMeasureFunction.LIZ(this, f, EnumC1321460kUa.fromInt(i), f2, EnumC1321460kUa.fromInt(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }
}
