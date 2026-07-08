package com.ss.android.ugc.aweme.favorites.business.music.raven.banner;

import X.C0QSJ;
import X.C13LE;
import X.C191862104e;
import X.C191871104n;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C433400Gz4;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC989510brB;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.music.raven.MusicCollectionBannerInfo;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MusicCollectionBannerAssem extends BaseRavenComponentDynamicAssem<MusicCollectionBannerInfo> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxTextView LLJJI;
    public MusicCollectionBannerInfo LLJJIII;
    public boolean LLJJIJI;
    public final C433400Gz4 LLJJIJIIJIL = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.0Gz4
        @Override // X.InterfaceC989510brB
        public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C433390Gz3(privacyUserSettingsV2, this.LL, null), 2);
        }
    };
    public volatile IRavenDataAbility LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCollectionBannerAssem.class, "ravenDataAbility", "getRavenDataAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenDataAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.c6x;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RavenDataScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RavenDataScope.class);
        return arrayList;
    }

    public final IRavenDataAbility lp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{RavenDataScope.class});
            this.LLJJJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        IRavenDataAbility iRavenDataAbility = (IRavenDataAbility) c0qsjLIZLLL.getAbility(IRavenDataAbility.class);
        C687700QyG.LJ(iRavenDataAbility, IRavenDataAbility.class);
        return iRavenDataAbility;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C191862104e c191862104eLJ = C191871104n.LJ();
        C433400Gz4 c433400Gz4 = this.LLJJIJIIJIL;
        c191862104eLJ.getClass();
        C191862104e.LIZJ(c433400Gz4);
        IRavenDataAbility iRavenDataAbilityLp = this.LLJJIJIL;
        if (iRavenDataAbilityLp == null) {
            synchronized (this) {
                iRavenDataAbilityLp = this.LLJJIJIL;
                if (iRavenDataAbilityLp == null) {
                    iRavenDataAbilityLp = lp();
                    this.LLJJIJIL = iRavenDataAbilityLp;
                }
            }
        }
        RavenData<Object> ravenDataNH = iRavenDataAbilityLp.nH("isMine");
        this.LLJJIJI = ravenDataNH != null ? Intrinsics.LJFF(ravenDataNH.data, Boolean.TRUE) : false;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C191862104e c191862104eLJ = C191871104n.LJ();
        C433400Gz4 c433400Gz4 = this.LLJJIJIIJIL;
        c191862104eLJ.getClass();
        C191862104e.LIZLLL(c433400Gz4);
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, X.InterfaceC1161890gLD
    /* JADX INFO: renamed from: mp, reason: merged with bridge method [inline-methods] */
    public final void Ab1(MusicCollectionBannerInfo musicCollectionBannerInfo) {
        int i;
        super.Ab1(musicCollectionBannerInfo);
        this.LLJJIII = musicCollectionBannerInfo;
        TuxTextView tuxTextView = this.LLJJI;
        if (tuxTextView != null) {
            if (musicCollectionBannerInfo.getVisible()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView);
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = view.getContext();
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
        tuxTextView.setBackgroundColor(C960203pA.LIZ(R.attr.uk, context));
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
        tuxTextView.setText(context.getText(2131828418));
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1j, context));
        tuxTextView.setTuxFont(41);
        tuxTextView.measure(0, 0);
        this.LLJJI = tuxTextView;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.eqx);
        if (viewGroup != null) {
            viewGroup.addView(this.LLJJI);
        }
    }
}
