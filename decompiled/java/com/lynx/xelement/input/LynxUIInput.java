package com.lynx.xelement.input;

import X.C0WZX;
import X.C1311730kEt;
import X.C19LS;
import X.C21360018iU;
import X.C2204961BRm;
import X.C430850Gux;
import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import j27.s;

/* JADX INFO: loaded from: classes33.dex */
public class LynxUIInput extends LynxUIBaseInput {
    public static final /* synthetic */ int LLJJL = 0;

    @Override // com.lynx.xelement.input.LynxUIBaseInput
    public final int LJJIJIIJI() {
        return 16;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        super.onNodeReady();
        int height = C430850Gux.LIZ(String.valueOf(C2204961BRm.LLLLZLL((C21360018iU) this.mView, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6beIvsASk=", null))), (EditText) this.mView, Integer.MAX_VALUE).getHeight();
        Layout layoutLIZ = C430850Gux.LIZ(((TextView) this.mView).getHint(), (EditText) this.mView, Integer.MAX_VALUE);
        ShadowNode shadowNodeLJFF = this.mContext.LJFF(getSign());
        if (shadowNodeLJFF == null || !(shadowNodeLJFF instanceof LynxUIBaseInputShadowNode)) {
            return;
        }
        LynxUIBaseInputShadowNode lynxUIBaseInputShadowNode = (LynxUIBaseInputShadowNode) shadowNodeLJFF;
        int height2 = layoutLIZ.getHeight();
        if (height2 >= height) {
            height = height2;
        }
        if (height != lynxUIBaseInputShadowNode.LJJJLIIL) {
            lynxUIBaseInputShadowNode.LJJJLIIL = height;
            lynxUIBaseInputShadowNode.LJ = false;
            lynxUIBaseInputShadowNode.LJIILLIIL();
            lynxUIBaseInputShadowNode.LIZ.LJIIIZ(lynxUIBaseInputShadowNode.LIZIZ);
        }
    }

    @Override // com.lynx.xelement.input.LynxUIBaseInput
    /* JADX INFO: renamed from: LJJIJ */
    public final C21360018iU createView(Context context) {
        C21360018iU c21360018iUCreateView = super.createView(context);
        c21360018iUCreateView.setLines(1);
        c21360018iUCreateView.setSingleLine(true);
        c21360018iUCreateView.setGravity(16);
        c21360018iUCreateView.setHorizontallyScrolling(true);
        c21360018iUCreateView.setEllipsize(TextUtils.TruncateAt.END);
        c21360018iUCreateView.setPadding(0, 0, 0, 0);
        c21360018iUCreateView.setOnEditorActionListener(new C19LS(this, 0));
        return c21360018iUCreateView;
    }

    @Override // com.lynx.xelement.input.LynxUIBaseInput, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        if (Build.VERSION.SDK_INT >= 28) {
            ((EditText) this.mView).setLineHeight((int) this.mFontSize);
        }
        ((TextView) this.mView).setFilters(new InputFilter[]{this.LLJJIJIL, this.LLJJJ, this.LLJJJIL});
    }

    @Override // com.lynx.xelement.input.LynxUIBaseInput, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    public LynxUIInput(s sVar, Object obj) {
        super(sVar, obj);
    }
}
