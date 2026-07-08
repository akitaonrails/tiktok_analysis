package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui;

import X.AbstractC652340PiK;
import X.AbstractC658420Ps8;
import X.C01GW;
import X.C0BRN;
import X.C0PBW;
import X.C0PCQ;
import X.C0PCY;
import X.C0PFZ;
import X.C0PIF;
import X.C0PNL;
import X.C0PNW;
import X.C0PRC;
import X.C0PRW;
import X.C0PYE;
import X.C0Q3E;
import X.C0R48;
import X.C1483370ohj;
import X.C14EU;
import X.C15O7;
import X.C1603960rqE;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C20635815oy;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C293680BfC;
import X.C294600Bgg;
import X.C301500Bro;
import X.C301530Brr;
import X.C436190H8n;
import X.C437150HCf;
import X.C452501pT;
import X.C486180J4u;
import X.C587060N0u;
import X.C642600PIk;
import X.C643200PKs;
import X.C644560PPy;
import X.C645920PVe;
import X.C645930PVf;
import X.C645940PVg;
import X.C646000PVm;
import X.C646370PWx;
import X.C648300Pbo;
import X.C650630PfZ;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C651970Phj;
import X.C651980Phk;
import X.C652390PiP;
import X.C652600Pik;
import X.C652630Pin;
import X.C652990PjN;
import X.C653160Pje;
import X.C653350Pjx;
import X.C653360Pjy;
import X.C653380Pk0;
import X.C653400Pk2;
import X.C653440Pk6;
import X.C653660PkS;
import X.C653830Pkj;
import X.C653840Pkk;
import X.C654740PmC;
import X.C654760PmE;
import X.C654790PmH;
import X.C655580PnY;
import X.C656630PpF;
import X.C658220Pro;
import X.C658280Pru;
import X.C658370Ps3;
import X.C659130PtH;
import X.C660870Pw5;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C664400Q4g;
import X.C664590Q4z;
import X.C666560QCo;
import X.C735370Ssx;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.InterfaceC584630MwP;
import X.InterfaceC641090PCp;
import X.InterfaceC648310Pbp;
import X.InterfaceC648720PcU;
import X.InterfaceC652640Pio;
import X.InterfaceC653030PjR;
import X.InterfaceC653050PjT;
import X.InterfaceC656470Poz;
import X.InterfaceC659190PtN;
import X.InterfaceC665370Q7z;
import Y.ACallableS82S0201000_10;
import Y.AObjectS113S0000000_10;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal$ActiveArea;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes11.dex */
public class SearchAwemeCardViewHolder extends AbstractC652340PiK implements InterfaceC653030PjR, InterfaceC653050PjT, DefaultLifecycleObserver, InterfaceC656470Poz, InterfaceC648310Pbp, GenericLifecycleObserver {
    public final LifecycleOwner LLILLL;
    public final Function0<InterfaceC665370Q7z> LLILZ;
    public final ArrayList<Aweme> LLILZIL;
    public boolean LLILZLL;
    public C653160Pje LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C652600Pik LLJILJIL;

    @Override // X.InterfaceC648310Pbp
    public final boolean K4() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC653030PjR
    public final void LIZIZ() {
    }

    public int LJIIJJI() {
        return -1;
    }

    public int LJIIL() {
        return 0;
    }

    public String LJIILIIL() {
        return "";
    }

    public String LJIILJJIL() {
        return "";
    }

    public String LJIILL() {
        return "";
    }

    public void LJIJI(Aweme aweme) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC653050PjT
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC653030PjR
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return false;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public final C658220Pro LJIIIZ() {
        return (C658220Pro) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC648310Pbp
    public final View d5() {
        return this.LL.itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648310Pbp
    public final int y1() {
        return hashCode();
    }

    @Override // X.InterfaceC653030PjR
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C648300Pbo.LIZLLL(this);
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU LLL() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU n5() {
        return this.LLJILJIL;
    }

    public final void LJIIIIZZ(List<? extends Aweme> list) {
        InterfaceC648720PcU interfaceC648720PcU;
        C658370Ps3 c658370Ps3 = LJIIIZ().LLIZ;
        if (c658370Ps3 != null && c658370Ps3.LIZIZ && !this.LLILZLL) {
            if (C0PNW.LIZIZ()) {
                new C20635815oy().LIZIZ(this.LL.LLILLJJLI);
            }
            C653380Pk0.LIZ(EventBus.LIZLLL(), this);
            this.LLILZLL = true;
        }
        this.LLILZIL.clear();
        this.LLILZIL.addAll(list);
        LJII(LJIIIZ());
        C658220Pro c658220ProLJIIIZ = LJIIIZ();
        ArrayList<Aweme> arrayList = this.LLILZIL;
        c658220ProLJIIIZ.LLILZLL = arrayList;
        c658220ProLJIIIZ.notifyDataSetChanged();
        c658220ProLJIIIZ.LLIZLLLIL.LIZJ(arrayList, new AObjectS113S0000000_10(4));
        C0PFZ c0pfz = C0PFZ.LIZ;
        ArrayList<Aweme> arrayList2 = this.LLILZIL;
        c0pfz.getClass();
        C0PFZ.LIZLLL(0, true, arrayList2);
        C653660PkS c653660PkSLIZ = C660870Pw5.LIZ(this.LL.itemView);
        SearchAwemeCardForUser searchAwemeCardForUser = (SearchAwemeCardForUser) this;
        c653660PkSLIZ.LJJLI = new AwS589S0100000_10(searchAwemeCardForUser, 234);
        c653660PkSLIZ.LJJLIIIIJ = LJIILIIL();
        c653660PkSLIZ.LJJLIIIJLJLI = AFwS241S0000000_10.get$arr$(252);
        c653660PkSLIZ.LJJLIIIJL = AFwS241S0000000_10.get$arr$(253);
        LJIIIZ().LLILLJJLI = c653660PkSLIZ;
        C648300Pbo.LIZJ(this, this.LL.LLILLJJLI);
        RecyclerView recyclerView = this.LL.LLILLJJLI;
        if (recyclerView.isAttachedToWindow()) {
            C652630Pin c652630PinLIZIZ = C653830Pkj.LIZIZ(this.LL.LLILLJJLI);
            if (c652630PinLIZIZ != null) {
                interfaceC648720PcU = c652630PinLIZIZ.LL;
            } else {
                interfaceC648720PcU = null;
            }
            C653160Pje c653160Pje = this.LLIZ;
            if (c653160Pje != null && interfaceC648720PcU != null) {
                interfaceC648720PcU.LJI(this.LL.LLILLJJLI, c653160Pje, -1, false);
                return;
            }
            return;
        }
        recyclerView.addOnAttachStateChangeListener(new C0R48(searchAwemeCardForUser, recyclerView, 7));
    }

    @C14EU
    public final void onBridgeEvent(C653360Pjy c653360Pjy) {
        Function1<Boolean, Unit> function1;
        InterfaceC641090PCp interfaceC641090PCpLIZ = C642600PIk.LIZ(this.LL.itemView);
        if (interfaceC641090PCpLIZ != null) {
            int iHashCode = interfaceC641090PCpLIZ.hashCode();
            Integer num = c653360Pjy.LIZ;
            if (num != null && num.intValue() == iHashCode && (function1 = c653360Pjy.LIZIZ) != null) {
                RecyclerView recyclerView = this.LL.LLILLJJLI;
                int childCount = recyclerView.getChildCount();
                if (recyclerView.getLayoutManager() != null && recyclerView.getChildCount() > 0) {
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                            if (childViewHolder instanceof C658280Pru) {
                                C658280Pru c658280Pru = (C658280Pru) childViewHolder;
                                if (c658280Pru.getBindingAdapterPosition() != -1 && c658280Pru.isPlaying()) {
                                    function1.invoke(Boolean.TRUE);
                                    return;
                                }
                            }
                            if (childViewHolder instanceof UserPhotoHolder) {
                                UserPhotoHolder userPhotoHolder = (UserPhotoHolder) childViewHolder;
                                if (userPhotoHolder.getBindingAdapterPosition() != -1 && userPhotoHolder.isPlaying()) {
                                    function1.invoke(Boolean.TRUE);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot find ContainerStatusProvider");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        ((C652990PjN) this.LLJIJIL.getValue()).LJIIIZ = C653840Pkk.class;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        ((C652990PjN) this.LLJIJIL.getValue()).LJIIJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoEvent(X.C737030Svd r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder.onVideoEvent(X.0Svd):void");
    }

    @Override // X.InterfaceC656470Poz
    public final void LIZ(int i, Aweme aweme) {
        C15O7.LIZJ(new ACallableS82S0201000_10(this, aweme, i, 0));
    }

    public final Bundle LJIIJ(View view, Aweme aweme) {
        C653660PkS c653660PkSLIZ = C660870Pw5.LIZ(view);
        String str = "general_search";
        if (!TextUtils.equals(c653660PkSLIZ.LJIIIIZZ, "general_search")) {
            str = "visual_search";
            if (!TextUtils.equals(c653660PkSLIZ.LJIIIIZZ, "visual_search")) {
                str = "smart_search_title";
                if (!TextUtils.equals(c653660PkSLIZ.LJIIIIZZ, "smart_search_title")) {
                    str = "search_result";
                }
            }
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
        C786410Ut5.LJJJI("video_from", "from_no_request", bundle);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("search_keyword", c653660PkSLIZ.LJFF, bundle);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", LJIIJJI());
        C786410Ut5.LJJJI("search_id", c653660PkSLIZ.LJIIJ, bundle);
        C786410Ut5.LJJJI("list_item_id", aweme.getAid(), bundle);
        C786410Ut5.LJJJI("search_result_id", AwemeExtKt.getAuthorUid(aweme), bundle);
        bundle.putInt("search_detail", 1);
        C786410Ut5.LJJJI("playlist_search_id", c653660PkSLIZ.LJIIJ, bundle);
        C786410Ut5.LJJJI("key_search_type", c653660PkSLIZ.LIZLLL, bundle);
        bundle.putInt("is_from_video", 2);
        if (!AwemeSaaSExtKt.isLive(aweme) && !aweme.isAd()) {
            C786410Ut5.LJJJI("search_enter_position", "video", bundle);
        }
        return bundle;
    }

    public C654760PmE LJIJ(Aweme aweme, Integer num) {
        String aid;
        String desc;
        Integer numValueOf;
        Integer numValueOf2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        String aid2;
        Long lValueOf;
        C653660PkS c653660PkSLIZ = C660870Pw5.LIZ(this.LL.itemView);
        C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c653660PkSLIZ);
        c654760PmELIZIZ.LJIIZILJ("token_type", LJIILL());
        c654760PmELIZIZ.LJIIZILJ("list_result_type", LJIILIIL());
        c654760PmELIZIZ.LJIJI("search_result_id", LJIILJJIL());
        String ecSearchBoBcLabelText = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c654760PmELIZIZ.LJIIZILJ("list_item_id", aid);
        c654760PmELIZIZ.LJJIJLIJ(Integer.valueOf(LJIIL()));
        c654760PmELIZIZ.LJJIJL(num);
        c654760PmELIZIZ.LJIIZILJ("item_rank", String.valueOf(num));
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = null;
        }
        c654760PmELIZIZ.LJ("aladdin_words", desc);
        String str = "1";
        c654760PmELIZIZ.LJIIZILJ("is_aladdin", "1");
        if (aweme != null) {
            if (AwemeSaaSExtKt.isLive(aweme)) {
                User author = aweme.getAuthor();
                if (author != null) {
                    lValueOf = Long.valueOf(C486180J4u.LIZ(author));
                } else {
                    lValueOf = null;
                }
                c654760PmELIZIZ.LJJIZ(String.valueOf(lValueOf));
                c654760PmELIZIZ.LJIIZILJ("list_result_type", "live");
                c654760PmELIZIZ.LJJJ(aweme);
                c654760PmELIZIZ.LJJJI(aweme);
            }
            if (AwemeExtKt.isPhotoMode(aweme)) {
                c654760PmELIZIZ.LJIIZILJ("list_result_type", "photo");
                String aid3 = aweme.getAid();
                if (aid3 == null) {
                    aid3 = "";
                }
                c654760PmELIZIZ.LJIIZILJ("search_third_item_id", aid3);
                C656630PpF.LIZ(aweme, c654760PmELIZIZ);
            }
        }
        if (C0BRN.LIZ()) {
            View view = this.LL.itemView;
            String strLJIILJJIL = LJIILJJIL();
            if (aweme != null) {
                aid2 = aweme.getAid();
            } else {
                aid2 = null;
            }
            C645920PVe.LIZIZ(c654760PmELIZIZ, view, strLJIILJJIL, aid2);
        }
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c654760PmELIZIZ.LJJIFFI(numValueOf);
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            numValueOf2 = Integer.valueOf(imageList.size());
        } else {
            numValueOf2 = null;
        }
        c654760PmELIZIZ.LJJIIJZLJL(numValueOf2);
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
        }
        if (!C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c654760PmELIZIZ.LJ("compliance_certification", str);
        c654760PmELIZIZ.LJ("video_tag", C659130PtH.LIZ(aweme));
        C653400Pk2.LIZIZ(aweme, c654760PmELIZIZ);
        C645930PVf.LIZ(c654760PmELIZIZ);
        c654760PmELIZIZ.LJ("module", c653660PkSLIZ.LJJJJLL);
        return c654760PmELIZIZ;
    }

    @Override // X.InterfaceC648310Pbp
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        C648300Pbo.LIZIZ(this, aweme, c0pbw);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C648300Pbo.LJ(this, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchAwemeCardViewHolder(C652390PiP c652390PiP, LifecycleOwner lifecycleOwner, Function0<? extends InterfaceC665370Q7z> function0) {
        C652600Pik c652600Pik;
        super(c652390PiP);
        this.LLILLL = lifecycleOwner;
        this.LLILZ = function0;
        this.LLILZIL = new ArrayList<>();
        final SearchAwemeCardForUser searchAwemeCardForUser = (SearchAwemeCardForUser) this;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS411S0200000_10(c652390PiP, searchAwemeCardForUser, 38));
        this.LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(c652390PiP, 539));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(c652390PiP, 538));
        this.LLJI = c01gwLIZIZ;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS411S0200000_10(c652390PiP, searchAwemeCardForUser, 39));
        c652390PiP.itemView.addOnAttachStateChangeListener(new C0R48(searchAwemeCardForUser, c652390PiP, 5));
        C437150HCf c437150HCf = c652390PiP.LLILZLL;
        if (c437150HCf != null) {
            c437150HCf.LIZ((ILynxSearchHorizontal$ActiveArea) c01gwLIZIZ.getValue());
        }
        if (Intrinsics.LJFF(C653350Pjx.LIZJ, new AbstractC658420Ps8() { // from class: X.0Pjw
            {
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320));
            }
        })) {
            c652600Pik = new C652600Pik();
        } else {
            c652600Pik = new C652600Pik() { // from class: X.0Pjv
                public final float LJIILIIL = 50.0f;

                @Override // X.C652600Pik, X.InterfaceC648720PcU
                public final void LIZLLL(final int i, final InterfaceC648120PbW interfaceC648120PbW) {
                    RecyclerView.LayoutManager layoutManager;
                    if (i == -1) {
                        return;
                    }
                    RecyclerView recyclerView = this.LIZLLL;
                    LinearLayoutManager linearLayoutManager = null;
                    if (recyclerView != null) {
                        layoutManager = recyclerView.getLayoutManager();
                    } else {
                        layoutManager = null;
                    }
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    }
                    int iLIZ = (int) C11VU.LIZ(this.LJIILIIL);
                    if (linearLayoutManager != null) {
                        linearLayoutManager.scrollToPositionWithOffset(i, iLIZ);
                    }
                    RecyclerView recyclerView2 = this.LIZLLL;
                    if (recyclerView2 != null) {
                        if (recyclerView2.isLaidOut() && !recyclerView2.isLayoutRequested()) {
                            LJIIJ(i, interfaceC648120PbW);
                        } else {
                            recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Pjz
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                    view.removeOnLayoutChangeListener(this);
                                    LJIIJ(i, interfaceC648120PbW);
                                }
                            });
                        }
                    }
                }
            };
        }
        c652600Pik.LJIIL = new InterfaceC652640Pio() { // from class: X.0Pju
            @Override // X.InterfaceC652640Pio
            public final int LIZ(Aweme aweme) {
                SearchAwemeCardViewHolder searchAwemeCardViewHolder = searchAwemeCardForUser;
                searchAwemeCardViewHolder.getClass();
                if (!TextUtils.equals(C658220Pro.LLJIJIL, aweme.getAid())) {
                    searchAwemeCardViewHolder.LJIJI(aweme);
                }
                Iterator<Aweme> it2 = searchAwemeCardViewHolder.LLILZIL.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (TextUtils.equals(it2.next().getAid(), aweme.getAid())) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                C0PUV.LIZIZ(aweme, searchAwemeCardViewHolder.LL.itemView, searchAwemeCardViewHolder.LJIIIZ().LLILLJJLI, EnumC645610PTz.USER_SUB_CARD, true, false);
                return i;
            }
        };
        View view = c652390PiP.itemView;
        if (view.isAttachedToWindow()) {
            C652630Pin c652630PinLIZIZ = C653830Pkj.LIZIZ(view);
            if (c652630PinLIZIZ != null) {
                c652630PinLIZIZ.LL = c652600Pik;
            }
        } else {
            view.addOnAttachStateChangeListener(new C0R48(c652600Pik, view, 6));
        }
        this.LLJILJIL = c652600Pik;
    }

    public void LJIILLIIL(Aweme aweme, View view, List<? extends Aweme> list, String str) {
        C0PNL c0pnl = new C0PNL();
        c0pnl.LJIL(list);
        C0PIF.LIZ.getClass();
        String strLJIIIZ = C0PIF.LJIIIZ(view);
        if (strLJIIIZ == null) {
            strLJIIIZ = CardStruct.IStatusCode.DEFAULT;
        }
        String aid = aweme.getAid();
        c0pnl.LLJJJJ = strLJIIIZ;
        c0pnl.LLJJJJJIL = aid;
        c0pnl.LLJJJJLIIL = false;
        c0pnl.LLJJL = C643200PKs.LJ(aweme);
        C1603960rqE.LIZ = c0pnl;
        Bundle bundleLJIIJ = LJIIJ(view, aweme);
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam(bundleLJIIJ);
        smartRouteBuildRoute.withBundleAnimation(c1606420ruCLIZ.LJFF());
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildRoute.withParam("search_detail", C301530Brr.LIZ());
        smartRouteBuildRoute.withParam("playlist_search_id", C660870Pw5.LIZ(view).LJIIJ);
        smartRouteBuildRoute.withParam("key_search_type", C660870Pw5.LIZ(view).LIZLLL);
        smartRouteBuildRoute.withParam("is_from_video", 2);
        if (str != null) {
            smartRouteBuildRoute.withParam("source_btm_token", str);
        }
        smartRouteBuildRoute.open();
        C1483370ohj.LIZ(aweme);
    }

    public C654740PmC LJIIZILJ(Aweme aweme, Integer num, String str, View view) {
        String aid;
        String desc;
        String str2;
        Integer numValueOf;
        Integer numValueOf2;
        String ecSearchBoBcLabelText;
        AwemeCommerceStruct commerceVideoAuthInfo;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        Long lValueOf;
        C664030Q2v c664030Q2v;
        C653660PkS c653660PkSLIZ = C660870Pw5.LIZ(this.LL.itemView);
        C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkSLIZ);
        c654740PmCLIZ.LJIIZILJ("token_type", LJIILL());
        c654740PmCLIZ.LJIIZILJ("list_result_type", LJIILIIL());
        c654740PmCLIZ.LJIJI("search_result_id", LJIILJJIL());
        c654740PmCLIZ.LJIJI("user_tag", c653660PkSLIZ.LJJ);
        c654740PmCLIZ.LJIIZILJ("user_list", c653660PkSLIZ.LJIL);
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c654740PmCLIZ.LJIIZILJ("list_item_id", aid);
        c654740PmCLIZ.LJJIJL(num);
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = null;
        }
        c654740PmCLIZ.LJ("aladdin_words", desc);
        String str3 = "1";
        c654740PmCLIZ.LJIIZILJ("is_aladdin", "1");
        c654740PmCLIZ.LJIIZILJ("aladdin_button_type", str);
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        if (c650960Pg6LIZJ != null && (c664030Q2v = c650960Pg6LIZJ.searchVideoModel) != null) {
            str2 = c664030Q2v.groupId;
        } else {
            str2 = null;
        }
        c654740PmCLIZ.LJIIZILJ("last_from_group_id", str2);
        c654740PmCLIZ.LJ("module", c653660PkSLIZ.LJJJJLL);
        c654740PmCLIZ.LJ("item_rank", String.valueOf(num));
        if (aweme != null) {
            if (AwemeSaaSExtKt.isLive(aweme)) {
                User author = aweme.getAuthor();
                if (author != null) {
                    lValueOf = Long.valueOf(C486180J4u.LIZ(author));
                } else {
                    lValueOf = null;
                }
                c654740PmCLIZ.LJJIZ(String.valueOf(lValueOf));
                c654740PmCLIZ.LJIIZILJ("list_result_type", "live");
                c654740PmCLIZ.LJJJ(aweme);
                c654740PmCLIZ.LJJJI(aweme);
            }
            if (AwemeExtKt.isPhotoMode(aweme)) {
                c654740PmCLIZ.LJIIZILJ("list_result_type", "photo");
                String aid3 = aweme.getAid();
                if (aid3 == null) {
                    aid3 = "";
                }
                c654740PmCLIZ.LJ("search_third_item_id", aid3);
                C656630PpF.LIZ(aweme, c654740PmCLIZ);
            }
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c654740PmCLIZ.LJJIFFI(numValueOf);
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            numValueOf2 = Integer.valueOf(imageList.size());
        } else {
            numValueOf2 = null;
        }
        c654740PmCLIZ.LJJIIJZLJL(numValueOf2);
        c654740PmCLIZ.LJ("video_tag", C659130PtH.LIZ(aweme));
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
        } else {
            ecSearchBoBcLabelText = null;
        }
        if (!C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c654740PmCLIZ.LJ("compliance_certification", str3);
        C653400Pk2.LIZIZ(aweme, c654740PmCLIZ);
        C645930PVf.LIZ(c654740PmCLIZ);
        String strLJIILJJIL = LJIILJJIL();
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        C645920PVe.LIZIZ(c654740PmCLIZ, view, strLJIILJJIL, aid2);
        return c654740PmCLIZ;
    }

    @Override // X.InterfaceC656470Poz
    public void LJFF(int i, View view, Aweme aweme, List<? extends Aweme> list, boolean z) {
        String strLIZIZ;
        String uid;
        String str;
        String str2;
        String str3;
        String str4;
        Integer numValueOf;
        C646370PWx c646370PWx;
        ISearchContextAbility iSearchContextAbilityLIZ;
        C0PCY<C646370PWx> c0pcyWO2;
        List<PhotoModeImageUrlModel> imageList;
        C664030Q2v c664030Q2v;
        Fragment fragmentLIZ;
        String str5;
        int i2;
        String string;
        String str6;
        String str7;
        String str8;
        Long l;
        String str9;
        String str10;
        C664030Q2v c664030Q2v2;
        C0PYE c0pye;
        C664000Q2s c664000Q2s;
        String str11;
        if (!AwemeSaaSExtKt.isLive(aweme) || C301500Bro.LIZ()) {
            if (!AwemeSaaSExtKt.isLive(aweme)) {
                C0PIF.LIZ.getClass();
                InterfaceC641090PCp interfaceC641090PCpLIZ = C642600PIk.LIZ(view);
                if (interfaceC641090PCpLIZ != null) {
                    fragmentLIZ = interfaceC641090PCpLIZ.LIZ();
                } else {
                    fragmentLIZ = null;
                }
                C0PIF.LJIIJ(fragmentLIZ);
            }
            C666560QCo.LIZIZ(C660870Pw5.LIZ(this.LL.itemView));
            if (AwemeExtKt.isPhotoMode(aweme)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("c7013.d60730_i");
                sbLIZ.append(i);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("c7013.d69513_i");
                sbLIZ2.append(i);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderVia = PageFinder.via(view);
            BcmParams bcmParams = new BcmParams();
            String strLIZ = C436190H8n.LIZ(aweme);
            if (strLIZ == null) {
                strLIZ = "";
            }
            bcmParams.put("aweme_id", strLIZ);
            User author = aweme.getAuthor();
            if (author == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            bcmParams.put("user_id", uid);
            C653660PkS c653660PkS = LJIIIZ().LLILLJJLI;
            if (c653660PkS == null || (str = c653660PkS.LJIIJ) == null) {
                str = "";
            }
            bcmParams.put("search_id", str);
            C653660PkS c653660PkS2 = LJIIIZ().LLILLJJLI;
            if (c653660PkS2 == null || (str2 = c653660PkS2.LJIJI) == null) {
                str2 = "";
            }
            bcmParams.put("search_result_id", str2);
            LJIILLIIL(aweme, view, list, btmSDK.createJumpSourceBtmToken(strLIZIZ, pageFinderVia, bcmParams));
            C1483370ohj.LIZ(aweme);
            if (!AwemeSaaSExtKt.isLive(aweme)) {
                C653660PkS c653660PkSLIZ = C660870Pw5.LIZ(view);
                if (TextUtils.equals(c653660PkSLIZ.LJIIIIZZ, "general_search")) {
                    str3 = "general_search";
                } else {
                    str3 = "visual_search";
                    if (!TextUtils.equals(c653660PkSLIZ.LJIIIIZZ, "visual_search")) {
                        str3 = "smart_search_title";
                        if (!TextUtils.equals(c653660PkSLIZ.LJIIIIZZ, "smart_search_title")) {
                            str3 = "search_result";
                        }
                    }
                }
                C0PIF.LIZ.getClass();
                String strLJIIIZ = C0PIF.LJIIIZ(view);
                C654790PmH c654790PmH = new C654790PmH(c653660PkSLIZ);
                c654790PmH.LJJJIL(aweme);
                c654790PmH.LJIIZILJ("group_id", C735370Ssx.LIZJ(aweme));
                c654790PmH.LJIJJ(str3);
                c654790PmH.LJIIZILJ("search_keyword", c653660PkSLIZ.LJFF);
                c654790PmH.LJIIZILJ("enter_method", "aladdin_card");
                c654790PmH.LJIIZILJ("video_tag", C659130PtH.LIZ(aweme));
                c654790PmH.LJIIZILJ("search_id", C735370Ssx.LJIJJ(aweme));
                c654790PmH.LJIIZILJ("log_pb", c653660PkSLIZ.LJIILJJIL);
                c654790PmH.LJIJI("search_result_id", AwemeExtKt.getAuthorUid(aweme));
                c654790PmH.LJIIZILJ("list_item_id", aweme.getAid());
                c654790PmH.LJIIZILJ("list_result_type", LJIILIIL());
                c654790PmH.LJIIZILJ("search_type", c653660PkSLIZ.LIZLLL);
                C650950Pg5.Companion.getClass();
                C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
                if (c650960Pg6LIZJ != null && (c664030Q2v = c650960Pg6LIZJ.searchVideoModel) != null) {
                    str4 = c664030Q2v.groupId;
                } else {
                    str4 = null;
                }
                c654790PmH.LJIIZILJ("last_from_group_id", str4);
                c654790PmH.LJIIZILJ("click_times", strLJIIIZ);
                c654790PmH.LJJIFFI(Integer.valueOf(aweme.getAwemeType()));
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    numValueOf = Integer.valueOf(imageList.size());
                } else {
                    numValueOf = null;
                }
                c654790PmH.LJJIIJZLJL(numValueOf);
                if (AwemeExtKt.isPhotoMode(aweme)) {
                    String aid = aweme.getAid();
                    if (aid != null) {
                        c654790PmH.LJIIZILJ("search_third_item_id", aid);
                    }
                    C656630PpF.LIZ(aweme, c654790PmH);
                }
                C645930PVf.LIZ(c654790PmH);
                c654790PmH.LJ("module", c653660PkSLIZ.LJJJJLL);
                C653400Pk2.LIZIZ(aweme, c654790PmH);
                Integer num = c653660PkSLIZ.LJIILLIIL;
                if (view != null && (iSearchContextAbilityLIZ = C0Q3E.LIZ(view)) != null && (c0pcyWO2 = iSearchContextAbilityLIZ.wO2()) != null) {
                    c646370PWx = (C646370PWx) c0pcyWO2.LIZJ();
                } else {
                    c646370PWx = null;
                }
                C643200PKs.LIZ(c654790PmH, c646370PWx, num);
                if (z) {
                    C664590Q4z.LIZ.getClass();
                    c654790PmH.LIZIZ(C664590Q4z.LIZIZ(aweme, z));
                }
                c654790PmH.LJIILJJIL();
            }
        }
        C653440Pk6.LIZ(i, view, LJIILJJIL(), null);
        Integer numValueOf2 = Integer.valueOf(i);
        if (AwemeSaaSExtKt.isLive(aweme)) {
            str5 = "click_live";
        } else if (AwemeExtKt.isPhotoMode(aweme)) {
            str5 = "click_photo";
        } else {
            str5 = "click_video";
        }
        LJIIZILJ(aweme, numValueOf2, str5, this.LL.itemView).LJIILJJIL();
        C650950Pg5.Companion.getClass();
        C0PRW c0prwLIZLLL = C646000PVm.LIZLLL(view);
        if (c0prwLIZLLL != null) {
            i2 = c0prwLIZLLL.tabIndex;
        } else {
            i2 = 0;
        }
        String strLJIILLIIL = C644560PPy.LJIILLIIL(i2);
        if (C293680BfC.LIZ()) {
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            Pair[] pairArr = new Pair[2];
            if (c0prwLIZLLL == null || (str11 = c0prwLIZLLL.searchId) == null) {
                str11 = "";
            }
            pairArr[0] = new Pair("search_id", str11);
            pairArr[1] = new Pair("search_result_id", AwemeExtKt.getAuthorUid(aweme));
            iEcomSearchService.LJJLIIJ(view, "c0", "d0", C2097608Jq.LJIIJ(pairArr), null);
        }
        C651980Phk c651980Phk = C651970Phj.LLILLL;
        Pair[] pairArr2 = new Pair[22];
        pairArr2[0] = new Pair("token_type", LJIILL());
        pairArr2[1] = new Pair("is_aladdin", "1");
        pairArr2[2] = new Pair("list_result_type", LJIILIIL());
        pairArr2[3] = new Pair("search_result_id", LJIILJJIL());
        if (!AwemeSaaSExtKt.isLive(aweme)) {
            string = aweme.getAid();
        } else {
            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt == null || (string = Long.valueOf(newLiveRoomDataExt.id).toString()) == null) {
                string = "";
            }
        }
        pairArr2[4] = new Pair("list_item_id", string);
        pairArr2[5] = new Pair("is_from_video", "2");
        pairArr2[6] = new Pair("is_search_scene", "1");
        if (c0prwLIZLLL == null || (str6 = c0prwLIZLLL.searchKeyword) == null) {
            str6 = "";
        }
        pairArr2[7] = new Pair("search_keyword", str6);
        pairArr2[8] = new Pair("search_type", strLJIILLIIL);
        if (c0prwLIZLLL == null || (str7 = c0prwLIZLLL.searchId) == null) {
            str7 = "";
        }
        pairArr2[9] = new Pair("search_id", str7);
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view);
        if (c650960Pg6LJI == null || (c664000Q2s = c650960Pg6LJI.searchCommonModel) == null || (str8 = c664000Q2s.enterFrom) == null) {
            str8 = "";
        }
        pairArr2[10] = new Pair("search_entrance", str8);
        pairArr2[11] = new Pair("search_rank", String.valueOf(C660870Pw5.LIZ(this.LL.itemView).LJIILL));
        C650960Pg6 c650960Pg6LJI2 = C646000PVm.LJI(view);
        if (c650960Pg6LJI2 != null && (c0pye = c650960Pg6LJI2.searchSessionModel) != null) {
            l = c0pye.searchSessionId;
        } else {
            l = null;
        }
        pairArr2[12] = new Pair("search_session_id", String.valueOf(l));
        pairArr2[13] = new Pair("enter_from_merge", "general_search");
        String requestId = aweme.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        pairArr2[14] = new Pair("request_id", requestId);
        if (AwemeSaaSExtKt.isLive(aweme)) {
            str9 = "live_cover";
        } else {
            str9 = "video_cell";
        }
        pairArr2[15] = new Pair("enter_method", str9);
        pairArr2[16] = new Pair("group_id", aweme.getAid());
        C650960Pg6 c650960Pg6LJI3 = C646000PVm.LJI(view);
        if (c650960Pg6LJI3 == null || (c664030Q2v2 = c650960Pg6LJI3.searchVideoModel) == null || (str10 = c664030Q2v2.groupId) == null) {
            str10 = "";
        }
        pairArr2[17] = new Pair("last_from_group_id", str10);
        pairArr2[18] = new Pair("search_token_type", LJIILL());
        pairArr2[19] = new Pair("search_outer_rank", String.valueOf(C660870Pw5.LIZ(this.LL.itemView).LJIILL));
        pairArr2[20] = new Pair("search_enter_method", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJLL);
        pairArr2[21] = new Pair("fullscreen_enter_doc_id", aweme.getAid());
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr2);
        if (AwemeSaaSExtKt.isLive(aweme) && C301500Bro.LIZ()) {
            mapLJIIJ.put("search_live_enter_method", "live_cover");
        }
        if (!AwemeSaaSExtKt.isLive(aweme)) {
            mapLJIIJ.put("search_enter_position", "hot_user_video");
            mapLJIIJ.put("search_third_item_id", aweme.getAid());
        }
        mapLJIIJ.put("module", C660870Pw5.LIZ(this.LL.itemView).LJJJJLL);
        c651980Phk.getClass();
        C651980Phk.LJFF(mapLJIIJ, false);
    }
}
