package com.ss.android.ugc.aweme.tako.botpage.bottombox.vm;

import X.C1854870yMv;
import X.C1855040yNC;
import X.EnumC1854550yMP;
import X.InterfaceC0148002o;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS77S1000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BottomInputViewModel extends AssemViewModel<C1855040yNC> {
    public String LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1855040yNC(0);
    }

    public final void yQ2() {
        withState(new AwS606S0100000_27(this, 204));
    }

    public final List<BaseImage> TG1() {
        return getState().LLIZ;
    }

    public final int vQ2() {
        return getState().LLIZ.size();
    }

    public final boolean wQ2() {
        return getState().LLJILLL != null;
    }

    public final void AQ2(String str) {
        if (Intrinsics.LJFF(getState().LLJILJIL, str)) {
            return;
        }
        setStateImmediate(new AwS77S1000000_27(str, 8));
        yQ2();
        withState(new AwS606S0100000_27(this, 336));
    }

    public final boolean xQ2(String str) {
        int i;
        boolean z;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        return TextUtils.isEmpty(str.subSequence(i2, length + 1).toString());
    }

    public final void zQ2(String str) {
        if (Intrinsics.LJFF(getState().LLJILJILJ, str)) {
            return;
        }
        setState(new AwS77S1000000_27(str, 7));
    }

    public final boolean BQ2(String str, boolean z) {
        EnumC1854550yMP enumC1854550yMP = getState().LLJJ;
        C1854870yMv.LIZ.getClass();
        if (((Number) C1854870yMv.LIZIZ.getValue()).intValue() != 1 || z || !xQ2(str)) {
            return false;
        }
        if ((enumC1854550yMP != EnumC1854550yMP.EDIT_IMAGE && enumC1854550yMP != EnumC1854550yMP.IMAGE_TO_VIDEO) || !wQ2()) {
            return false;
        }
        return true;
    }
}
