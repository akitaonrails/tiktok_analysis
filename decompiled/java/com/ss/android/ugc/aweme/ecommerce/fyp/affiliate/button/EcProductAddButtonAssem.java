package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button;

import X.C01GW;
import X.C09R3;
import X.C0C64;
import X.C0HHT;
import X.C0O9N;
import X.C0RP1;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1637806bA;
import X.C1637906bB;
import X.C1892160zL4;
import X.C1892170zL5;
import X.C19336610ku;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C622680Oba;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class EcProductAddButtonAssem extends BaseCellSlotComponent<EcProductAddButtonAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public C197039127h LLJLLIL;
    public ViewGroup LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public int LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final C01GW LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcProductAddButtonAssem.class, "buttonVM", "getButtonVM()Lcom/ss/android/ugc/aweme/ecommerce/fyp/affiliate/button/EcProductAddButtonViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EcProductAddButtonAssem.class, "holderVM", "getHolderVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(EcProductAddButtonAssem.class, "playVM", "getPlayVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoPlayViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(EcProductAddButtonAssem.class, "favoriteVM", "getFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(EcProductAddButtonAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(EcProductAddButtonAssem.class, "eventDispatchVM", "getEventDispatchVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoEventDispatchViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(EcProductAddButtonAssem.class, "antiAddictionVM", "getAntiAddictionVM()Lcom/ss/android/ugc/aweme/feed/assem/addiction/VideoAntiAddictionVM;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public EcProductAddButtonAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcProductAddButtonViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ, 201), null, AFwS271S0000000_28.get$arr$(96));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoViewModel.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ2, 202), null, AFwS271S0000000_28.get$arr$(97));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(VideoPlayViewModel.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ3, 203), null, AFwS271S0000000_28.get$arr$(98));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(VideoFavoriteVM.class);
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c0hht, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ4, 204), null, AFwS271S0000000_28.get$arr$(99));
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(VideoDiggVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c0hht, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ5, 205), null, AFwS271S0000000_28.get$arr$(100));
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(VideoEventDispatchViewModel.class);
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c0hht, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ6, 199), null, AFwS271S0000000_28.get$arr$(94));
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(VideoAntiAddictionVM.class);
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c0rp1, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ7, 200), null, AFwS271S0000000_28.get$arr$(95));
        this.LLLIIIIL = true;
        this.LLLIIIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(149));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.amr;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void so() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(this, LLLIIL[6]), new C2217381BqS() { // from class: X.0RjA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0R91) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(30), 6);
    }

    public final EcProductAddButtonViewModel Ep() {
        return (EcProductAddButtonViewModel) this.LLJZ.getValue(this, LLLIIL[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
    }

    public final void Bp(Function0<Unit> function0) {
        if (this.LLLIIII && !this.LLLII) {
            function0.invoke();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C0O9N c0o9n) {
        EcProductAddButtonViewModel.vQ2(Ep(), "5");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LLJLLL = viewGroup;
        this.LLJLLIL = (C197039127h) view.findViewById(R.id.rww);
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLIIL;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[2]), new C2217381BqS() { // from class: X.0RmK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLILZLL;
            }
        }, null, AFwS315S0000000_28.get$arr$(7), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0zKu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1892050zKt) obj).LLILLJJLI;
            }
        }, null, AFwS315S0000000_28.get$arr$(8), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0zKv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1892050zKt) obj).LL;
            }
        }, null, AFwS315S0000000_28.get$arr$(9), 6);
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ec_add_product_button_show_optimize", true, true)) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0RoG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, null, AFwS315S0000000_28.get$arr$(10), 6);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0RoH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS315S0000000_28.get$arr$(2), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(this, interfaceC2217461BqaArr[2]), new C2217381BqS() { // from class: X.0RyK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJ;
            }
        }, null, AFwS315S0000000_28.get$arr$(3), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(this, interfaceC2217461BqaArr[2]), new C2217381BqS() { // from class: X.0RmI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, null, AFwS315S0000000_28.get$arr$(4), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(this, interfaceC2217461BqaArr[4]), new C2217381BqS() { // from class: X.0RnB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730490Sl5) obj).LLILZLL;
            }
        }, null, AFwS315S0000000_28.get$arr$(5), 6);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLLF.getValue(this, interfaceC2217461BqaArr[3]);
        selectSubscribe(assemViewModel, new C2217381BqS() { // from class: X.0Sn4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0Sn8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0SnC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C731530Sml) obj).LLILZLL;
            }
        }, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, C19336610ku.get$arr$(3));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(this, interfaceC2217461BqaArr[5]), new C2217381BqS() { // from class: X.0Sn0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LL;
            }
        }, null, AFwS315S0000000_28.get$arr$(6), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        int duration;
        VideoItemParams videoItemParams2 = videoItemParams;
        EcProductAddButtonViewModel ecProductAddButtonViewModelEp = Ep();
        String str = "";
        ecProductAddButtonViewModelEp.LLILLJJLI = "";
        ecProductAddButtonViewModelEp.LLILZ = "";
        ecProductAddButtonViewModelEp.LLILZIL = "homepage_hot";
        ecProductAddButtonViewModelEp.LLILZLL = null;
        ecProductAddButtonViewModelEp.LLIZLLLIL = null;
        ecProductAddButtonViewModelEp.LLJ = ecProductAddButtonViewModelEp.LL;
        ecProductAddButtonViewModelEp.LLJI = false;
        ecProductAddButtonViewModelEp.LLJIJIL = 0;
        C197039127h c197039127h = this.LLJLLIL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setText((CharSequence) null);
        C197039127h c197039127h2 = this.LLJLLIL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.U8(c197039127h2, null);
        EcProductAddButtonViewModel ecProductAddButtonViewModelEp2 = Ep();
        ecProductAddButtonViewModelEp2.getClass();
        Aweme aweme = videoItemParams2.getAweme();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = ecProductAddButtonViewModelEp2.LLILLJJLI;
        }
        ecProductAddButtonViewModelEp2.LLILLJJLI = aid;
        Video video = aweme.getVideo();
        if (video != null) {
            duration = video.getDuration();
        } else {
            duration = Integer.MAX_VALUE;
        }
        ecProductAddButtonViewModelEp2.LLJIJIL = duration;
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (authorUid == null) {
            authorUid = ecProductAddButtonViewModelEp2.LLILZ;
        }
        ecProductAddButtonViewModelEp2.LLILZ = authorUid;
        String str2 = videoItemParams2.mEventType;
        if (str2 != null) {
            ecProductAddButtonViewModelEp2.LLILZIL = str2;
        }
        AnchorBizUtils.LIZ.getClass();
        List<AnchorProductInfo> listLJJZZI = AnchorBizUtils.LJJZZI(aweme);
        ecProductAddButtonViewModelEp2.LLIZ = listLJJZZI;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJJZZI).iterator();
        while (it2.hasNext()) {
            Long l = ((AnchorProductInfo) it2.next()).productId;
            if (l != null) {
                arrayList.add(l);
            }
        }
        ecProductAddButtonViewModelEp2.LLILZLL = arrayList;
        String str3 = ecProductAddButtonViewModelEp2.LLILZIL;
        Map<String, Object> map = ecProductAddButtonViewModelEp2.LLJ;
        String aid2 = aweme.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        map.put("video_id", aid2);
        String requestId = aweme.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        map.put("request_id", requestId);
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ != null) {
            str = strLJJLIIIJ;
        }
        map.put("product_ids", str);
        map.put("enter_from", str3);
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZ.put("enter_from", ecProductAddButtonViewModelEp2.LLILZIL);
        this.LLLII = false;
        C1892160zL4 c1892160zL4 = C1892160zL4.LIZ;
        Aweme aweme2 = videoItemParams2.getAweme();
        c1892160zL4.getClass();
        this.LLLIIII = C1892160zL4.LJ(aweme2);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_add_product_button_show_optimize", true, true) && this.LLLIIIIL) {
            this.LLLIIIIL = false;
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, LLLIIL[1]), new C2217381BqS() { // from class: X.0NzJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, null, new AwS642S0100000_28(videoItemParams2, 75), 6);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        EventBus.LIZLLL().LJIJJ(this);
    }
}
