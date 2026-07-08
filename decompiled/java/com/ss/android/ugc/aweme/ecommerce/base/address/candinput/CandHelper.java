package com.ss.android.ugc.aweme.ecommerce.base.address.candinput;

import X.C01GW;
import X.C0WZX;
import X.C1058220de0;
import X.C12ES;
import X.C13LP;
import X.C14MI;
import X.C1697810uHb;
import X.C1745540vWa;
import X.C1745560vWc;
import X.C1747750va9;
import X.C1748720vbi;
import X.C1C7U;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.C958103op;
import X.C960203pA;
import Y.ARunnableS2S1301000_26;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class CandHelper {
    public static final int LJIILJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final Context LIZ;
    public final View LIZIZ;
    public PopupWindow LIZJ;
    public RecyclerView LIZLLL;
    public C1745560vWc LJ;
    public boolean LJFF;
    public int LJI = 1;
    public String LJII = "";
    public final List<String> LJIIIIZZ = C1697810uHb.LJIIJJI("phone", "email");
    public final List<String> LJIIIZ = C1697810uHb.LJIIJJI("address", "road_name", "address_searchbar");
    public String LJIIJ = "";
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(65));
    public String LJIIL = "";
    public final CandHelper$handler$1 LJIILIIL;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-5));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    public final int LIZIZ() {
        C1745560vWc c1745560vWc = this.LJ;
        if (c1745560vWc == null) {
            c1745560vWc = null;
        }
        List<CandInputData> list = c1745560vWc.LL;
        int size = list != null ? list.size() : 0;
        C1745560vWc c1745560vWc2 = this.LJ;
        return (c1745560vWc2 != null ? c1745560vWc2 : null).LLILZ ? size - 1 : size;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class CustomLinearLayoutMgr extends LinearLayoutManager {
        public CustomLinearLayoutMgr(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void setMeasuredDimension(Rect rect, int i, int i2) {
            super.setMeasuredDimension(rect, i, View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), Integer.MIN_VALUE));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper$handler$1] */
    public CandHelper(Context context, View view) {
        this.LIZ = context;
        this.LIZIZ = view;
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIILIIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("CandHelper@42bd.handler$1");
                CandHelper candHelper = this.LL;
                View view2 = candHelper.LIZIZ;
                if (view2.hasFocus() || (!view2.hasFocus() && Intrinsics.LJFF(null, "zipcode"))) {
                    message.getCallback().run();
                } else {
                    candHelper.LIZ(null, null);
                }
                C1C7U.LIZIZ("CandHelper@42bd.handler$1");
            }
        };
    }

    public final void LIZ(AddressEditViewModel addressEditViewModel, String str) {
        AddressEditFragment addressEditFragment;
        PopupWindow popupWindow = this.LIZJ;
        PopupWindow popupWindow2 = null;
        if (popupWindow == null) {
            popupWindow = null;
        }
        if (popupWindow.isShowing() && str != null && addressEditViewModel != null && (addressEditFragment = AddressEditFragment.LLLII) != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C1747750va9(), new AwS140S1100000_26(addressEditViewModel, str, 8));
        }
        PopupWindow popupWindow3 = this.LIZJ;
        if (popupWindow3 != null) {
            popupWindow2 = popupWindow3;
        }
        popupWindow2.dismiss();
    }

    public final void LIZJ(AddressEditViewModel addressEditViewModel, String str) {
        this.LJII = str;
        RecyclerView recyclerView = new RecyclerView(this.LIZ);
        this.LIZLLL = recyclerView;
        recyclerView.addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, this.LIZ), 0, C12ES.LIZJ(12.0f, this.LIZ), 2));
        RecyclerView recyclerView2 = this.LIZLLL;
        PopupWindow popupWindow = null;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setVerticalScrollBarEnabled(false);
        RecyclerView recyclerView3 = this.LIZLLL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        PopupWindow popupWindow2 = new PopupWindow((View) recyclerView3, C958103op.LIZLLL() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), -2, false);
        this.LIZJ = popupWindow2;
        popupWindow2.setInputMethodMode(1);
        PopupWindow popupWindow3 = this.LIZJ;
        if (popupWindow3 == null) {
            popupWindow3 = null;
        }
        popupWindow3.setSoftInputMode(16);
        C1745560vWc c1745560vWc = new C1745560vWc();
        this.LJ = c1745560vWc;
        c1745560vWc.LLILZIL = new C1745540vWa(this, addressEditViewModel, str);
        RecyclerView recyclerView4 = this.LIZLLL;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setAdapter(c1745560vWc);
        RecyclerView recyclerView5 = this.LIZLLL;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        CustomLinearLayoutMgr customLinearLayoutMgr = new CustomLinearLayoutMgr(this.LIZ);
        customLinearLayoutMgr.setOrientation(1);
        recyclerView5.setLayoutManager(customLinearLayoutMgr);
        PopupWindow popupWindow4 = this.LIZJ;
        if (popupWindow4 == null) {
            popupWindow4 = null;
        }
        popupWindow4.setBackgroundDrawable(C14MI.LIZ(this.LIZ, R.drawable.b1e));
        PopupWindow popupWindow5 = this.LIZJ;
        if (popupWindow5 != null) {
            popupWindow = popupWindow5;
        }
        popupWindow.setElevation(C418440Gaw.LIZIZ(8));
    }

    public final boolean LIZLLL(String str, CharSequence charSequence, AddressEditViewModel addressEditViewModel, int i) {
        CharSequence charSequenceLJLIIIL;
        CharSequence charSequenceLJLIIIL2;
        CharSequence charSequenceLJLIIIL3;
        ClientConfig clientConfig;
        String str2;
        List listLJJLIIIJILLIZJL;
        ClientConfig clientConfig2;
        String str3;
        if (str != null && (clientConfig2 = addressEditViewModel.LLL) != null && (str3 = clientConfig2.disableCandidateKeys) != null && a0.LJJIIZI(str3, str, false)) {
            return false;
        }
        if (i != 1) {
            if (i == 2 && addressEditViewModel.mR2(str) && charSequence != null && charSequence.length() != 0) {
                return true;
            }
        } else {
            InputItemData inputItemData = addressEditViewModel.LLJJJJ;
            if (inputItemData != null && (clientConfig = inputItemData.config) != null && (str2 = clientConfig.enableFocusCandidateKeys) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) != null && C13LP.LJJJJ(str, listLJJLIIIJILLIZJL)) {
                return true;
            }
            if (C13LP.LJJJJ(str, this.LJIIIIZZ)) {
                if (charSequence == null || charSequence.length() == 0) {
                    return true;
                }
            } else if (C13LP.LJJJJ(str, this.LJIIIZ)) {
                if (charSequence != null && (charSequenceLJLIIIL3 = a0.LJLIIIL(charSequence)) != null && charSequenceLJLIIIL3.length() >= 4) {
                    return true;
                }
            } else if (addressEditViewModel.nR2(str)) {
                if (Intrinsics.LJFF(str, "zipcode")) {
                    if (charSequence != null && (charSequenceLJLIIIL2 = a0.LJLIIIL(charSequence)) != null && charSequenceLJLIIIL2.length() >= 3) {
                        return true;
                    }
                } else if (charSequence != null && (charSequenceLJLIIIL = a0.LJLIIIL(charSequence)) != null && charSequenceLJLIIIL.length() >= 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJ(EditText editText, String str, AddressEditViewModel addressEditViewModel, int i) {
        if (LIZLLL(str, C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsG7+SiImX9BKSt+beCOjh90hrOqE=", null)), addressEditViewModel, i)) {
            Message messageObtain = Message.obtain(this.LJIILIIL, new ARunnableS2S1301000_26(i, editText, this, addressEditViewModel, str, 1));
            messageObtain.what = 1;
            removeMessages(1);
            sendMessageDelayed(messageObtain, 300L);
            return;
        }
        LIZ(addressEditViewModel, str);
    }
}
