package com.ss.android.ugc.aweme.im.b2c.notice;

import X.AbstractC1905540zge;
import X.C01GW;
import X.C0PEM;
import X.C1227904rF;
import X.C13BV;
import X.C15438062q;
import X.C1559260qg8;
import X.C1735506qv;
import X.C1748206sy;
import X.C1748406t0;
import X.C1750306tJ;
import X.C1750506tL;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C869590Y9l;
import X.C896250ZDz;
import X.C909290Zln;
import X.EnumC1750406tK;
import X.InterfaceC0148002o;
import X.InterfaceC1743706sF;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS87S1200000_2;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessLeadInfoViewModel extends AssemViewModel<C1748406t0> implements InterfaceC1743706sF {
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(342));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(341));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 319));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1748406t0((List) null, (String) (0 == true ? 1 : 0), (ByteString) (0 == true ? 1 : 0), 15);
    }

    public final C909290Zln xQ2() {
        C457780HxI c457780HxI = (C457780HxI) this.LLILLJJLI.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (sessionInfo instanceof C909290Zln) {
            return (C909290Zln) sessionInfo;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1750306tJ(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1750506tL vQ2(java.util.List<java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoViewModel.vQ2(java.util.List):X.06tL");
    }

    @Override // X.InterfaceC1743706sF
    public final boolean WB(List list, ByteString byteString) {
        C1750506tL c1750506tLVQ2 = vQ2(list);
        C909290Zln c909290ZlnXQ2 = xQ2();
        EnumC1750406tK enumC1750406tK = c1750506tLVQ2.LIZIZ;
        List<C1735506qv> list2 = c1750506tLVQ2.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C1735506qv> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZIZ);
        }
        C1748206sy.LIZJ(c909290ZlnXQ2, "welcome_message", enumC1750406tK, list, arrayList, null, C896250ZDz.LIZ(byteString));
        if (c1750506tLVQ2.LIZIZ != EnumC1750406tK.SUCCESS) {
            return false;
        }
        setState(new AwS87S1200000_2(c1750506tLVQ2, byteString, 17));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1748406t0 wQ2(C869590Y9l c869590Y9l, boolean z) {
        boolean z2;
        String str = c869590Y9l.getExt().get("a:high_intent_let_leave_info");
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i = 15;
        Long lValueOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (z2) {
            return new C1748406t0((List) (objArr6 == true ? 1 : 0), (String) (objArr5 == true ? 1 : 0), (ByteString) (objArr4 == true ? 1 : 0), i);
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new AbstractC1905540zge<List<? extends String>>() { // from class: X.06tI
            }.getType();
            c1227904rF.getClass();
            List<String> list = (List) C1227904rF.LIZJ(str, type);
            C1750506tL c1750506tLVQ2 = vQ2(list);
            String str2 = c869590Y9l.getExt().get("a:src");
            if (str2 == null || str2.length() <= 0) {
                str2 = "normal_message";
            }
            if (z) {
                lValueOf = Long.valueOf(System.currentTimeMillis() - c869590Y9l.getLocalCreatedAt());
            }
            C909290Zln c909290ZlnXQ2 = xQ2();
            EnumC1750406tK enumC1750406tK = c1750506tLVQ2.LIZIZ;
            List<C1735506qv> list2 = c1750506tLVQ2.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C1735506qv> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZIZ);
            }
            C1748206sy.LIZJ(c909290ZlnXQ2, str2, enumC1750406tK, list, arrayList, lValueOf, C896250ZDz.LIZ(c869590Y9l.getPersistentExtra()));
            int i2 = 2;
            if (c1750506tLVQ2.LIZIZ == EnumC1750406tK.SUCCESS) {
                return new C1748406t0(c1750506tLVQ2.LIZ, str2, c869590Y9l.getPersistentExtra(), i2);
            }
            return new C1748406t0(C13BV.INSTANCE, str2, c869590Y9l.getPersistentExtra(), i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get lead info failed, exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return new C1748406t0((List) (objArr3 == true ? 1 : 0), (String) (objArr2 == true ? 1 : 0), (ByteString) (objArr == true ? 1 : 0), i);
        }
    }
}
