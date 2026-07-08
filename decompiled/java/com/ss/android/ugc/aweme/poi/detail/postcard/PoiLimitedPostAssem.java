package com.ss.android.ugc.aweme.poi.detail.postcard;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1174850gg7;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1220000hqw;
import X.C1367960lha;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2255108sX;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1201990hNt;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedPostAssem extends BaseSlashReusedComponent<PoiListApi.PoiMergedListResponse> {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1189));
    public final C736950SvV LLJLIL;
    public final C736950SvV LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e35;
    }

    public PoiLimitedPostAssem() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2447);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiPostPageShareVM.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(422);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((AbstractC738140SxQ) this, 1187);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJLIL = new C736950SvV(c19719912DlLIZ, awS562S0100000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_182, c451610HnL, c723700Sa8);
        AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18(this, 2448);
        this.LLJLILLLLZIIL = new C736950SvV(C13LE.LIZ(PoiPostPageShareVM.class), awS562S0100000_183, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(423), new AwS562S0100000_18((AbstractC738140SxQ) this, 1188), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = S2();
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, S2(), new C1185050gwZ(PageFinder.via(getContentView())), 16);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 179));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiLimitedPostAbility iPoiLimitedPostAbility = new IPoiLimitedPostAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.postcard.PoiLimitedPostAssem$initAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.postcard.IPoiLimitedPostAbility
                public final PoiPostPageShareVM LLLLLLZ() {
                    return (PoiPostPageShareVM) this.LL.LLJLIL.getValue();
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.postcard.IPoiLimitedPostAbility
                public final PoiPostPageShareVM s72() {
                    return (PoiPostPageShareVM) this.LL.LLJLILLLLZIIL.getValue();
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiLimitedPostAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiLimitedPostAbility, IPoiLimitedPostAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiLimitedPostAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiLimitedPostAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiLimitedPostAbility.class.getClassLoader(), new Class[]{IPoiLimitedPostAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiLimitedPostAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.postcard.IPoiLimitedPostAbility");
                    }
                }
            }
        }
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJJJIL(EnumC1201990hNt.POI_DETAIL, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiMergedListResponse r15) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.postcard.PoiLimitedPostAssem.up(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListResponse):void");
    }
}
