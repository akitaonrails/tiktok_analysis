package com.ss.android.ugc.aweme.repostfeed.feed;

import X.C01GW;
import X.C0CNO;
import X.C1360680lVq;
import X.C1388190mED;
import X.C1440005kM;
import X.C1564680qos;
import X.C1571230qzR;
import X.C1571770r0J;
import X.C1578000rAM;
import X.C1578630rBN;
import X.C1583220rIm;
import X.C1583230rIn;
import X.C1583250rIp;
import X.C1583300rIu;
import X.C1586870rOf;
import X.C1587150rP7;
import X.C1593850rZv;
import X.C1595430rcT;
import X.C19EG;
import X.C20152913tH;
import X.C20153113tJ;
import X.C20642515q3;
import X.C20684815ws;
import X.C2188811AlT;
import X.C260560AJa;
import X.C418440Gaw;
import X.C446900Hfk;
import X.C452501pT;
import X.C814420VxA;
import X.EnumC1583290rIt;
import X.EnumC1583310rIv;
import X.InterfaceC1571780r0K;
import X.InterfaceC20153213tK;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.model.ToolBarIconModel;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.repostfeed.preload.RepostFeedPreload;
import com.ss.android.ugc.aweme.repostfeed.repo.IRepostFeedApi;
import com.ss.android.ugc.aweme.repostfeed.ui.RepostFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS16S0111000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedProtocol implements ISocialTabProtocol {
    public boolean LL;
    public boolean LLILLJJLI = true;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1571230qzR());
    public final C1571770r0J LLILZ = new InterfaceC1571780r0K() { // from class: X.0r0J
        @Override // X.InterfaceC1571780r0K
        public final void LIZ(List<? extends InterfaceC1571760r0I> list) {
            InterfaceC1571760r0I interfaceC1571760r0I = (InterfaceC1571760r0I) C13LP.LJJJLZIJ(0, list);
            if (interfaceC1571760r0I != null) {
                interfaceC1571760r0I.LLLLLJIL(true);
            }
            InterfaceC1571760r0I interfaceC1571760r0I2 = (InterfaceC1571760r0I) C13LP.LJJJLZIJ(0, list);
            if (interfaceC1571760r0I2 != null) {
                interfaceC1571760r0I2.setIconModel(this.LIZ.LLILZLL);
            }
            InterfaceC1571760r0I interfaceC1571760r0I3 = (InterfaceC1571760r0I) C13LP.LJJJLZIJ(1, list);
            if (interfaceC1571760r0I3 != null) {
                interfaceC1571760r0I3.LLLLLJIL(false);
            }
        }

        @Override // X.InterfaceC1571780r0K
        public final void LIZIZ(List<? extends InterfaceC1571760r0I> list) {
            InterfaceC1571760r0I interfaceC1571760r0I = (InterfaceC1571760r0I) C13LP.LJJJLZIJ(0, list);
            if (interfaceC1571760r0I != null) {
                interfaceC1571760r0I.setIconModel(this.LIZ.LLILZIL);
            }
            InterfaceC1571760r0I interfaceC1571760r0I2 = (InterfaceC1571760r0I) C13LP.LJJJLZIJ(1, list);
            if (interfaceC1571760r0I2 != null) {
                interfaceC1571760r0I2.LLLLLJIL(false);
            }
        }
    };
    public final ToolBarIconModel LLILZIL;
    public final ToolBarIconModel LLILZLL;
    public final String LLIZ;
    public Context LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void B3() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void Gu1() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void L() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String getMob() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean isLoading() {
        return false;
    }

    public final boolean LIZ() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    public final void LIZJ() {
        if (this.LL) {
            return;
        }
        IRepostFeedApi.LIZ.getClass();
        C20152913tH.LIZLLL.getClass();
        if (C20153113tJ.LIZ()) {
            C20153113tJ.LIZJ(new InterfaceC20153213tK() { // from class: X.0rIl
                @Override // X.InterfaceC20153213tK
                public final void LIZ(C20152113t9 c20152113t9) {
                    Bundle bundle = new Bundle();
                    C1593850rZv.LIZ.getClass();
                    C20684815ws.LJIJI("repost_feed_preload", new Pair(1, "has_init"));
                    c20152113t9.LIZ(bundle, RepostFeedPreload.class, new InterfaceC1726310v1Z() { // from class: X.0rIq
                        @Override // X.InterfaceC1726310v1Z
                        public final void LIZ(Exception exc) {
                        }

                        @Override // X.InterfaceC1726310v1Z
                        public final void onSuccess(Object obj) {
                        }
                    }, Boolean.FALSE);
                }
            });
        } else {
            C1593850rZv.LIZ.getClass();
            C20684815ws.LJIJI("repost_feed_preload", new Pair(0, "has_init"));
        }
        this.LL = true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void aw0() {
        ZA1(C1595430rcT.LIZIZ.LIZIZ().numberCountByTag(this.LLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean enable() {
        C1360680lVq.LIZ.getClass();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0r0J] */
    public RepostFeedProtocol() {
        this.LLILZIL = new ToolBarIconModel(false, R.raw.icon_person_plus, R.attr.ee, EnumC1583310rIv.DEFAULT, false, null, null, C20642515q3.LJI(2131845474), LIZ() ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) : null, true, new C1583250rIp());
        this.LLILZLL = new ToolBarIconModel(false, LIZ() ? R.drawable.bv5 : R.raw.icon_magnifying_glass_offset, R.attr.ee, EnumC1583310rIv.SEARCH, false, null, null, C20642515q3.LJI(R.string.spp), LIZ() ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) : Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), !LIZ(), new C1583230rIn());
        this.LLIZ = "REPOST_FEED";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return RepostFeedFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final InterfaceC1571780r0K fK() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String getTag() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void EP2(EnumC1583290rIt enumC1583290rIt) {
        C19EG c19egLIZIZ;
        FeedFragment feedFragment;
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        Context context = this.LLIZLLLIL;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            Fragment fragmentKi = c446900Hfk.LIZ(c19egLIZIZ).Ki("REPOST_FEED");
            if ((fragmentKi instanceof FeedFragment) && (feedFragment = (FeedFragment) fragmentKi) != null) {
                feedFragment.Oi(true);
                C1440005kM.LIZ(new C1564680qos(13));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void OM1(String str) {
        if (this.LLILLJJLI) {
            C1583220rIm.LIZ = true;
            C1583220rIm.LIZLLL = System.currentTimeMillis();
            C1578000rAM.LJIIIIZZ = true;
            this.LLILLJJLI = false;
        }
        if (((Number) C260560AJa.LIZ.getValue()).intValue() > 0) {
            LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        C1578630rBN.LJIIIIZZ(bundle, "Repost");
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void d21(SocialFeedRedDotResponse socialFeedRedDotResponse) {
        NewContentResponse.RepostFeedRedDotResponse repostFeedRedDotResponse;
        int redDotCount = socialFeedRedDotResponse.getRedDotCount();
        ArrayList<ContentMetadata> metaList = null;
        if ((socialFeedRedDotResponse instanceof NewContentResponse.RepostFeedRedDotResponse) && (repostFeedRedDotResponse = (NewContentResponse.RepostFeedRedDotResponse) socialFeedRedDotResponse) != null) {
            metaList = repostFeedRedDotResponse.getMetaList();
        }
        C1586870rOf.LIZ.clear();
        ArrayList<ContentMetadata> arrayList = C1586870rOf.LIZIZ;
        arrayList.clear();
        ((ArrayList) C1586870rOf.LIZJ).clear();
        if (metaList != null) {
            arrayList.addAll(metaList);
        }
        ZA1(redDotCount, false);
        C1583300rIu.LIZ.getClass();
        if (C1583300rIu.LIZJ()) {
            C1587150rP7.LIZIZ.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void init(Context context) {
        this.LLIZLLLIL = context;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String mc(Context context) {
        return context.getString(2131824781);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTouchEvent: event.action: ");
        Integer numValueOf2 = null;
        if (motionEvent != null) {
            numValueOf2 = Integer.valueOf(motionEvent.getAction());
        }
        sbLIZ.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILLJJLI && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                C1583220rIm.LIZIZ = System.currentTimeMillis();
                if (((Number) C260560AJa.LIZ.getValue()).intValue() == 1) {
                    LIZJ();
                    return;
                }
                return;
            }
            if (numValueOf.intValue() != 1) {
                return;
            }
            C1583220rIm.LIZJ = System.currentTimeMillis();
            C1583220rIm.LIZ = true;
            C1583220rIm.LIZLLL = System.currentTimeMillis();
            C1578000rAM.LJIIIIZZ = true;
            this.LLILLJJLI = false;
            if (((Number) C260560AJa.LIZ.getValue()).intValue() != 2) {
                return;
            }
            LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void ZA1(int i, boolean z) {
        C0CNO.LIZLLL(0L, new AwS16S0111000_24(i, this, z, 1));
    }
}
