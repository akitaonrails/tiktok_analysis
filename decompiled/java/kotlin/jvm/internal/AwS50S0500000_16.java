package kotlin.jvm.internal;

import X.C09AY;
import X.C1070120dxC;
import X.C1070140dxE;
import X.C1070520dxq;
import X.C1070560dxu;
import X.C1071540dzU;
import X.C1076010e6h;
import X.C11JF;
import X.C11NZ;
import X.C1397620mTQ;
import X.C23250099c;
import X.EnumC1070340dxY;
import X.InterfaceC497601wk;
import Y.AfS66S0400000_16;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS50S0500000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS50S0500000_16 awS50S0500000_16, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131846223, new AwS50S0500000_16((Context) awS50S0500000_16.l2, (LifecycleOwner) awS50S0500000_16.l3, (Function1) awS50S0500000_16.l0, (Function1) awS50S0500000_16.l1, (Function1) awS50S0500000_16.l4, 5));
        c1397620mTQ.LJII(2131846222, AFwS252S0000000_16.get$arr$(463));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS50S0500000_16 awS50S0500000_16, Object obj) {
        InterfaceC497601wk viewModelScope;
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LIZLLL(2, true);
        Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", true);
        ((Function1) awS50S0500000_16.l0).invoke(1);
        ((Function1) awS50S0500000_16.l1).invoke(2);
        if (C1076010e6h.LIZJ.LJII().LIZIZ()) {
            C1070520dxq c1070520dxq = C1070520dxq.LIZ;
            Context context = (Context) awS50S0500000_16.l2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) awS50S0500000_16.l3;
            c1070520dxq.getClass();
            FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
            if (findCtxViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(findCtxViewModel)) != null) {
                C23250099c.LIZLLL(viewModelScope, null, null, new C1070140dxE(context, lifecycleOwner, null), 3);
            }
        }
        C1070520dxq c1070520dxq2 = C1070520dxq.LIZ;
        Context context2 = (Context) awS50S0500000_16.l2;
        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) awS50S0500000_16.l3;
        Function1 function1 = (Function1) awS50S0500000_16.l0;
        Function1 function12 = (Function1) awS50S0500000_16.l4;
        c1070520dxq2.getClass();
        C11JF c11jf = C1070520dxq.LJIIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1070520dxq.LJIIL = (C11JF) C11NZ.LJJJJJL(0L, 1L, TimeUnit.SECONDS).LJJLJLI(new AfS66S0400000_16(context2, lifecycleOwner2, function1, function12, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS50S0500000_16 awS50S0500000_16, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131822135, new AwS50S0500000_16((Context) awS50S0500000_16.l2, (LifecycleOwner) awS50S0500000_16.l3, (Function1) awS50S0500000_16.l0, (Function1) awS50S0500000_16.l1, (Function1) awS50S0500000_16.l4, 1));
        c1397620mTQ.LJII(2131822134, AFwS252S0000000_16.get$arr$(465));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS50S0500000_16 awS50S0500000_16, Object obj) {
        FindCtxViewModel findCtxViewModel;
        InterfaceC497601wk viewModelScope;
        C1070560dxu.LIZ.getClass();
        C1070560dxu.LIZLLL(6, true);
        Keva.getRepo("mlbb_sync_repo").storeBoolean("mlbb_sync_is_removing", true);
        ((Function1) awS50S0500000_16.l0).invoke(1);
        ((Function1) awS50S0500000_16.l1).invoke(6);
        if (C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LIZIZ() && (findCtxViewModel = C1070520dxq.LIZJ) != null && (viewModelScope = ViewModelKt.getViewModelScope(findCtxViewModel)) != null) {
            C23250099c.LIZLLL(viewModelScope, null, null, new C1070120dxC((Context) awS50S0500000_16.l2, (LifecycleOwner) awS50S0500000_16.l3, null), 3);
        }
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = (Context) awS50S0500000_16.l2;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS50S0500000_16.l3;
        Function1 function1 = (Function1) awS50S0500000_16.l0;
        Function1 function12 = (Function1) awS50S0500000_16.l4;
        c1070520dxq.getClass();
        C1070520dxq.LIZLLL(context, lifecycleOwner, function1, function12);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS50S0500000_16 awS50S0500000_16, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131837433, new AwS50S0500000_16((Context) awS50S0500000_16.l2, (LifecycleOwner) awS50S0500000_16.l3, (Function1) awS50S0500000_16.l0, (Function1) awS50S0500000_16.l1, (Function1) awS50S0500000_16.l4, 3));
        c1397620mTQ.LJII(2131837432, AFwS252S0000000_16.get$arr$(478));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS50S0500000_16 r8, java.lang.Object r9) {
        /*
            X.0dzU r1 = X.C1071540dzU.LIZIZ
            X.0dxY r0 = X.EnumC1070340dxY.EMAIL
            X.0dxl r0 = r1.LJ(r0)
            boolean r4 = r0.LIZIZ()
            X.0dxu r0 = X.C1070560dxu.LIZ
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.getClass()
            X.C1070560dxu.LIZLLL(r3, r3)
            java.lang.String r0 = "contacts_sync_repo"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "contacts_sync_is_removing"
            r1.storeBoolean(r0, r3)
            java.lang.Object r0 = r8.l0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r2)
            java.lang.Object r0 = r8.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r2)
            X.0e6h r0 = X.C1076010e6h.LIZJ
            X.0dxv r0 = r0.LJIIJ()
            boolean r0 = r0.LIZIZ()
            if (r0 != 0) goto L4b
            X.0TNP r0 = X.C0TNP.LIZ
            r0.getClass()
            boolean r0 = X.C0TNP.LIZ()
            if (r0 == 0) goto L6c
            if (r4 == 0) goto L6c
        L4b:
            X.0dxq r0 = X.C1070520dxq.LIZ
            java.lang.Object r5 = r8.l2
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r8.l3
            androidx.lifecycle.LifecycleOwner r4 = (androidx.lifecycle.LifecycleOwner) r4
            r0.getClass()
            com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel r0 = X.C1070520dxq.LIZJ
            if (r0 == 0) goto L6c
            X.01wk r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            if (r3 == 0) goto L6c
            X.0dxG r2 = new X.0dxG
            r1 = 0
            r2.<init>(r5, r4, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
        L6c:
            X.0dxq r0 = X.C1070520dxq.LIZ
            java.lang.Object r5 = r8.l2
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r8.l3
            androidx.lifecycle.LifecycleOwner r6 = (androidx.lifecycle.LifecycleOwner) r6
            java.lang.Object r7 = r8.l0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r8.l4
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.getClass()
            X.11JF r0 = X.C1070520dxq.LJII
            if (r0 == 0) goto L88
            r0.dispose()
        L88:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 0
            r0 = 1
            X.11O1 r0 = X.C11NZ.LJJJJJL(r2, r0, r4)
            Y.AfS66S0400000_16 r4 = new Y.AfS66S0400000_16
            r9 = 3
            r4.<init>(r5, r6, r7, r8, r9)
            X.01kM r0 = r0.LJJLJLI(r4)
            X.11JF r0 = (X.C11JF) r0
            X.C1070520dxq.LJII = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS50S0500000_16.invoke$5(kotlin.jvm.internal.AwS50S0500000_16, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0500000_16(Context context, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, Function1 function13, int i) {
        super(1);
        this.$t = i;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = context;
        this.l3 = lifecycleOwner;
        this.l4 = function13;
    }
}
