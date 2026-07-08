package com.ss.android.ugc.aweme.tako.botpage.components.video.videoenhanced;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DSB;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C329510Cvt;
import X.C340860DXw;
import X.C452070Ho5;
import X.C452501pT;
import X.C597050NbL;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689490R2t;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS114S0200000_10;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS118S0101000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoEnhancedVideoAssem extends ReusedUISlotAssem<TakoEnhancedVideoAssem> implements InterfaceC712990Rxx<InterfaceC689490R2t> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 874));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 875));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 878));
    public final AssemVMLazy LLJLILLLLZIIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLL;
    public View LLJLLIL;
    public InterfaceC689490R2t LLJLLL;
    public long LLJZ;
    public boolean LLJZIJLIL;
    public Map<String, String> LLL;
    public final List<Aweme> LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoEnhancedVideoAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fm6;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public TakoEnhancedVideoAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 876);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(377);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 877), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLILLLLZIIL = assemVMLazy;
        this.LLL = new LinkedHashMap();
        this.LLLF = new ArrayList();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.video_list);
        this.LLJLLIL = view.findViewById(R.id.view_more);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C340860DXw.LIZ(viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoVideoEnhancedItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC689490R2t interfaceC689490R2t) {
        List<TakoVideoItem> videoList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List listLL;
        String str6;
        String str7;
        InterfaceC689490R2t interfaceC689490R2t2 = interfaceC689490R2t;
        List<TakoVideoItem> videoList2 = interfaceC689490R2t2.getVideoList();
        if (videoList2 != null && !videoList2.isEmpty()) {
            List<TakoVideoItem> videoList3 = interfaceC689490R2t2.getVideoList();
            InterfaceC689490R2t interfaceC689490R2t3 = this.LLJLLL;
            ArrayList arrayList = null;
            if (interfaceC689490R2t3 == null || (videoList = interfaceC689490R2t3.getVideoList()) == null) {
                videoList = C13BV.INSTANCE;
            }
            if (videoList3 == null) {
                videoList3 = C13BV.INSTANCE;
            }
            if (videoList3.size() == videoList.size()) {
                int size = videoList3.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.LJFF(((TakoVideoItem) ListProtector.get(videoList3, i)).awemeId, ((TakoVideoItem) ListProtector.get(videoList, i)).awemeId)) {
                    }
                }
                return;
            }
            this.LLJLLL = interfaceC689490R2t2;
            Pair[] pairArr = new Pair[7];
            C1863850ybP c1863850ybP = (C1863850ybP) this.LLJLIL.getValue();
            if (c1863850ybP != null) {
                str = c1863850ybP.LL;
            } else {
                str = null;
            }
            String str8 = "";
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("enter_from", str);
            C1863850ybP c1863850ybP2 = (C1863850ybP) this.LLJLIL.getValue();
            if (c1863850ybP2 == null || (str2 = c1863850ybP2.LLILLJJLI) == null) {
                str2 = "";
            }
            pairArr[1] = new Pair("enter_method", str2);
            Message msg = interfaceC689490R2t2.getMsg();
            if (msg == null || (str3 = msg.msgId) == null) {
                str3 = "";
            }
            pairArr[2] = new Pair("message_id", str3);
            C1863850ybP c1863850ybP3 = (C1863850ybP) this.LLJLIL.getValue();
            if (c1863850ybP3 == null || (str4 = c1863850ybP3.LLILZIL) == null) {
                str4 = "";
            }
            pairArr[3] = new Pair("process_id", str4);
            C1863850ybP c1863850ybP4 = (C1863850ybP) this.LLJLIL.getValue();
            if (c1863850ybP4 == null || (str5 = c1863850ybP4.LLILZLL) == null) {
                str5 = "";
            }
            pairArr[4] = new Pair("tako_session_id", str5);
            C1863850ybP c1863850ybP5 = (C1863850ybP) this.LLJLIL.getValue();
            if (c1863850ybP5 != null && (str7 = c1863850ybP5.LLIZ) != null) {
                str8 = str7;
            }
            pairArr[5] = new Pair("tako_chat_id", str8);
            pairArr[6] = new Pair("situation", "video_recommend");
            this.LLL = C2097608Jq.LJIIJ(pairArr);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C0DSB.LIZJ(viewOnAttachStateChangeListenerC20604515jv);
                List<TakoVideoItem> videoList4 = interfaceC689490R2t2.getVideoList();
                if (videoList4 != null && (listLL = C13LP.LL(videoList4, 4)) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    int i2 = 0;
                    for (Object obj : listLL) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            TakoVideoItem takoVideoItem = (TakoVideoItem) obj;
                            Message msg2 = interfaceC689490R2t2.getMsg();
                            if (msg2 != null) {
                                str6 = msg2.uuid;
                            } else {
                                str6 = null;
                            }
                            arrayList2.add(new C329510Cvt(i2, takoVideoItem, str6, new AwS118S0101000_10(this, i2, 8)));
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList2, null);
                }
            }
            AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
            ((TakoInnerDetailVM) assemVMLazy.getValue()).xQ2(null, null, new AwS376S0200000_10(this, interfaceC689490R2t2, 128));
            TakoInnerDetailVM takoInnerDetailVM = (TakoInnerDetailVM) this.LLJLILLLLZIIL.getValue();
            List<TakoVideoItem> videoList5 = interfaceC689490R2t2.getVideoList();
            if (videoList5 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(videoList5, 10));
                Iterator<TakoVideoItem> it2 = videoList5.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().awemeId);
                }
            }
            takoInnerDetailVM.vQ2(String.valueOf(arrayList));
            View view = this.LLJLLIL;
            if (view != null) {
                if (interfaceC689490R2t2.LLJZIJLIL()) {
                    C0DSB.LIZJ(view);
                    C786410Ut5.I7(new ACListenerS114S0200000_10(view, this, 30), view);
                    if (!this.LLJZIJLIL) {
                        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                        Map<String, String> map = this.LLL;
                        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                        c1862330yYx.getClass();
                        c20235014FoLIZ.LIZ("tikbot_view_more_show", map);
                        this.LLJZIJLIL = true;
                        return;
                    }
                    return;
                }
                C0DSB.LIZIZ(view);
                return;
            }
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            C0DSB.LIZIZ(viewOnAttachStateChangeListenerC20604515jv2);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            C0DSB.LIZIZ(view2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC689490R2t interfaceC689490R2t) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC689490R2t interfaceC689490R2t) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
