package defpackage;

import X.C0I7D;
import X.C0WZX;
import X.C1747750va9;
import X.C1748720vbi;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C814420VxA;
import Y.ARunnableS2S1301000_26;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionCandHelper {
    public static final int LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-5));
    public static final int LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final Context LIZ;
    public final EditText LIZIZ;
    public PopupWindow LIZJ;
    public RecyclerView LIZLLL;
    public s7 LJ;
    public boolean LJFF;
    public int LJI = 1;
    public String LJII = "";
    public Function2<? super List<Region>, ? super AddressBase, Unit> LJIIIIZZ = AFwS313S0000000_26.get$arr$(37);
    public String LJIIIZ = "";
    public final RegionCandHelper$handler$1 LJIIJ;

    public static final class a {
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

    /* JADX WARN: Type inference failed for: r0v3, types: [RegionCandHelper$handler$1] */
    public RegionCandHelper(Context context, C0I7D c0i7d) {
        this.LIZ = context;
        this.LIZIZ = c0i7d;
        final Looper mainLooper = Looper.getMainLooper();
        this.LJIIJ = new BPEAHandler(mainLooper) { // from class: RegionCandHelper$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                RegionCandHelper regionCandHelper = this.LL;
                EditText editText = regionCandHelper.LIZIZ;
                if (editText.hasFocus() || (!editText.hasFocus() && Intrinsics.LJFF(null, "zipcode"))) {
                    message.getCallback().run();
                } else {
                    regionCandHelper.LIZ(null, null, false);
                }
            }
        };
    }

    public final void LIZ(AddressEditViewModel addressEditViewModel, String str, boolean z) {
        AddressEditFragment addressEditFragment;
        Function2<? super List<Region>, ? super AddressBase, Unit> function2;
        PopupWindow popupWindow = this.LIZJ;
        if (popupWindow != null && popupWindow.isShowing()) {
            if (z && (function2 = this.LJIIIIZZ) != null) {
                function2.invoke(null, null);
            }
            if (str != null && addressEditViewModel != null && (addressEditFragment = AddressEditFragment.LLLII) != null) {
                C1748720vbi.LIZIZ(addressEditFragment, new C1747750va9(), new AwS140S1100000_26(addressEditViewModel, str, 0));
            }
        }
        PopupWindow popupWindow2 = this.LIZJ;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
    }

    public final void LIZIZ(C0I7D c0i7d, String str, AddressEditViewModel addressEditViewModel) throws Throwable {
        int length;
        CharSequence charSequenceLJLIIIL;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(c0i7d, new C0WZX("Rjp5VQ00fMvSUX8kSQKBdA==", null));
        if (editableLLJILLL != null && (charSequenceLJLIIIL = a0.LJLIIIL(editableLLJILLL)) != null) {
            length = charSequenceLJLIIIL.length();
        } else {
            length = 0;
        }
        if (length > 0) {
            Message messageObtain = Message.obtain(this.LJIIJ, new ARunnableS2S1301000_26(this, c0i7d, addressEditViewModel, str, 2));
            messageObtain.what = 1;
            removeMessages(1);
            sendMessageDelayed(messageObtain, 300L);
            return;
        }
        LIZ(addressEditViewModel, str, true);
    }
}
