package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.C01GW;
import X.C098200Yq;
import X.C0ZPH;
import X.C13LE;
import X.C1609500rzA;
import X.C17977072h;
import X.C189200o6;
import X.C1A5L;
import X.C2174761A9i;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C284010BBf;
import X.C418440Gaw;
import X.C430210Gtv;
import X.C430230Gtx;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C709140Rrk;
import X.C712260Rwm;
import X.C725080ScM;
import X.C729510SjV;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1398730mVD;
import Y.ACListenerS126S0200000_24;
import Y.ARunnableS111S0100000_11;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedAvatarSocialPublishAssem extends FeedBaseContentAssem<FeedAvatarSocialPublishAssem> {
    public static final /* synthetic */ int LLLF = 0;
    public C1609500rzA LLJLIL;
    public C430210Gtv LLJLILLLLZIIL;
    public C430210Gtv LLJLL;
    public C430230Gtx LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZIJLIL;
    public String LLL;
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS264S0000000_24.get$arr$(116));
    public final C01GW LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS264S0000000_24.get$arr$(117));
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 379));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS568S0100000_24(this, 383));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 381));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 382));
    public final MutableLiveData<C0ZPH> LLJZ = new MutableLiveData<>(C0ZPH.LIZJ);

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public final void up(VideoItemParams videoItemParams) {
        Object c098200Yq;
        C690870R8b c690870R8bJm;
        BaseCellSlotComponent baseCellSlotComponent;
        C1609500rzA c1609500rzA = null;
        try {
            LifecycleOwner parent = getParent();
            if ((parent instanceof BaseCellSlotComponent) && (baseCellSlotComponent = (BaseCellSlotComponent) parent) != null) {
                c690870R8bJm = baseCellSlotComponent.jm();
            } else {
                c690870R8bJm = null;
            }
            c098200Yq = Boolean.valueOf(C712260Rwm.LIZ(videoItemParams, c690870R8bJm));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        if (!C729510SjV.LJJ(videoItemParams.getAweme()) && !zBooleanValue) {
            InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJL.getValue();
            if (interfaceC1398730mVD != null) {
                interfaceC1398730mVD.LIZLLL(videoItemParams.getAweme().getAuthor());
            }
        } else {
            InterfaceC1398730mVD interfaceC1398730mVD2 = (InterfaceC1398730mVD) this.LLJL.getValue();
            if (interfaceC1398730mVD2 != null) {
                interfaceC1398730mVD2.reset();
            }
        }
        if (C2174761A9i.LIZIZ()) {
            C1609500rzA c1609500rzA2 = this.LLJLIL;
            if (c1609500rzA2 == null) {
                c1609500rzA2 = null;
            }
            if (c1609500rzA2.getParent() instanceof C709140Rrk) {
                C1609500rzA c1609500rzA3 = this.LLJLIL;
                if (c1609500rzA3 != null) {
                    c1609500rzA = c1609500rzA3;
                }
                C709140Rrk c709140Rrk = (C709140Rrk) c1609500rzA.getParent();
                c709140Rrk.LIZIZ("CLICK_TAG_FEED_AVATAR_SOCIAL", new ACListenerS126S0200000_24(this, c709140Rrk, 43));
                C2271391DvN.LIZ(c709140Rrk, (C1A5L) C2271381DvM.LJJIIZ.getValue());
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws JSONException {
        this.LLJLIL = (C1609500rzA) view.findViewById(R.id.i8g);
        this.LLJLILLLLZIIL = (C430210Gtv) view.findViewById(R.id.user_avatar);
        this.LLJLL = (C430210Gtv) view.findViewById(R.id.vng);
        this.LLJLLIL = (C430230Gtx) view.findViewById(R.id.vnd);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 380);
        if (C17977072h.LIZ()) {
            C725080ScM.LIZ().execute(new ARunnableS111S0100000_11(awS568S0100000_24, 15));
        } else {
            awS568S0100000_24.invoke();
        }
        if (((Boolean) C284010BBf.LIZ.getValue()).booleanValue()) {
            C430210Gtv c430210Gtv = this.LLJLILLLLZIIL;
            C430210Gtv c430210Gtv2 = null;
            if (c430210Gtv == null) {
                c430210Gtv = null;
            }
            c430210Gtv.setBorderAttrRes(R.attr.a02);
            C430210Gtv c430210Gtv3 = this.LLJLILLLLZIIL;
            if (c430210Gtv3 != null) {
                c430210Gtv2 = c430210Gtv3;
            }
            c430210Gtv2.setBorderWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        }
    }
}
