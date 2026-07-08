package com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay;

import X.C01GW;
import X.C098200Yq;
import X.C0GXB;
import X.C0H1U;
import X.C1018703yb;
import X.C12ES;
import X.C1390410mHn;
import X.C1488610oqB;
import X.C1488750oqP;
import X.C1568780qvU;
import X.C1568790qvV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C21353118hN;
import X.C21353218hO;
import X.C21353518hR;
import X.C21354518hb;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C23250099c;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.EnumC1569640qws;
import X.EnumC452301pR;
import X.InterfaceC1484830ok5;
import X.InterfaceC1740760vOs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS138S0101000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public final class ECLiveVideoReplayFragment extends ECBaseFragment implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKDo3ISAiKiHELIOSp9KyohJCA9ZjMlLSo8OiA8JS4qZgAPBSYlLRMlLSo8GiA8JS4qDjctLiI2JjE=";
    public FrameLayout LLILZ;
    public TextView LLILZIL;
    public C0GXB LLILZLL;
    public TuxIconView LLIZ;
    public FrameLayout LLIZLLLIL;
    public LinearLayout LLJ;
    public View LLJI;
    public SmartImageView LLJIJIL;
    public TextView LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public TextView LLJJ;
    public C1390410mHn LLJJI;
    public View LLJJIII;
    public C1488750oqP LLJJIJI;
    public C21353518hR LLJJIJIIJIL;
    public C21354518hb LLJJIJIL;
    public AwS433S0200000_32 LLJJJ;
    public VideoInfo LLJJJIL;
    public String LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJZIJLIL;
    public long LLL;
    public boolean LLLF;
    public long LLLFF;
    public boolean LLLFZ;
    public String LLLI;
    public String LLLII;
    public String LLLIIII;
    public Map<String, ? extends Object> LLLIIIIL;
    public String LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public long LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLIZZ;
    public final C01GW LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS576S0100000_32(this, 173));
    public long LLJLLIL = -1;
    public int LLJLLL = -1;
    public int LLJZ = -1;
    public String LLLFFI = "";
    public final C01GW LLLJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(58));

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b19738";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final void LJ() {
        C1390410mHn c1390410mHn = this.LLJJI;
        if (c1390410mHn != null) {
            C12ES.LJIILL(0, c1390410mHn);
            c1390410mHn.LIZJ();
        }
        View view = this.LLJJIII;
        if (view != null) {
            C0H1U.LIZIZ(view);
        }
    }

    public final void LJIIL() {
        C1390410mHn c1390410mHn = this.LLJJI;
        if (c1390410mHn == null || c1390410mHn.getVisibility() != 0) {
            return;
        }
        View view = this.LLJJIII;
        if (view == null || view.getVisibility() != 0) {
            C1390410mHn c1390410mHn2 = this.LLJJI;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZLLL();
            }
            C1390410mHn c1390410mHn3 = this.LLJJI;
            if (c1390410mHn3 != null) {
                C0H1U.LIZIZ(c1390410mHn3);
            }
        }
    }

    public final void cS() {
        if (this.LLLIIL) {
            return;
        }
        this.LLLIIL = true;
        this.LLLIL = System.currentTimeMillis();
        C1018703yb.LIZLLL("tiktokec_enter_page", new AwS611S0100000_32(this, 70));
        hS(this, "enter_page", null, 6);
    }

    public final void kS() {
        C1390410mHn c1390410mHn = this.LLJJI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
            C0H1U.LIZIZ(c1390410mHn);
        }
        View view = this.LLJJIII;
        if (view != null) {
            C12ES.LJIILL(0, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String string;
        String string2;
        String string3;
        InterfaceC1484830ok5 player;
        if (this.LLLIIL && !this.LLLIILIL) {
            long j = this.LLLIL;
            if (j > 0) {
                this.LLLIILIL = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                C1018703yb.LIZLLL("tiktokec_stay_page", new AwS138S0101000_32(this, (int) jCurrentTimeMillis, 9));
            }
        }
        dS(false);
        AwS433S0200000_32 awS433S0200000_32 = this.LLJJJ;
        if (awS433S0200000_32 != null) {
            awS433S0200000_32.invoke();
        }
        this.LLJJJ = null;
        C21354518hb c21354518hb = this.LLJJIJIL;
        C1488750oqP c1488750oqP = this.LLJJIJI;
        this.LLJJJJLIIL = false;
        C21353518hR c21353518hR = this.LLJJIJIIJIL;
        if (c21353518hR != null && c1488750oqP != null && (player = c1488750oqP.getPlayer()) != null) {
            player.LJJIIZ(c21353518hR);
        }
        this.LLJJIJIIJIL = null;
        if (c1488750oqP != null) {
            c1488750oqP.setStatusChangeListener(null);
        }
        C21353118hN c21353118hN = C21353118hN.LL;
        String str = this.LLLI;
        String str2 = this.LLLIIII;
        String str3 = this.LLJJJJ;
        String str4 = this.LLLII;
        if (c21354518hb != null) {
            c21353118hN.getClass();
            C23250099c.LIZLLL(C21353118hN.LLILLJJLI, null, null, new C21353218hO(c21354518hb, null), 3);
        } else {
            c21353118hN.getClass();
            C1568780qvU c1568780qvULIZ = C21353118hN.LIZ(str, str2, str3, str4, null);
            if (c1568780qvULIZ == null) {
                String string4 = str != null ? a0.LJLIIIL(str).toString() : null;
                String str5 = "";
                if (string4 == null) {
                    string4 = "";
                }
                if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null) {
                    string = "";
                }
                if (str3 != null && (string3 = a0.LJLIIIL(str3).toString()) != null) {
                    str5 = string3;
                }
                if (str4 == null || (string2 = a0.LJLIIIL(str4).toString()) == null || string2.length() <= 0) {
                    string2 = null;
                }
                c1568780qvULIZ = new C1568780qvU(string4, string, str5, string2, null);
            }
            C23250099c.LIZLLL(C21353118hN.LLILLJJLI, null, null, new C1568790qvV(c1568780qvULIZ, null), 3);
        }
        this.LLJJIJIL = null;
        this.LLL = 0L;
        this.LLLF = false;
        if (c21354518hb == null && c1488750oqP != null) {
            c1488750oqP.LIZIZ();
        }
        C1390410mHn c1390410mHn = this.LLJJI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        this.LLJJIJI = null;
        this.LLILZ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1488750oqP c1488750oqP = this.LLJJIJI;
        if (c1488750oqP != null) {
            c1488750oqP.LJ();
        }
        this.LLJJL = false;
        TuxIconView tuxIconView = this.LLIZ;
        if (tuxIconView != null) {
            C12ES.LJIILL(0, tuxIconView);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(ECLiveVideoReplayFragment.class.getName());
        }
        super.onResume();
        C2211631BhB.LJIIL(this, null);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final void VR(Map map) {
        String str = this.LLLII;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str3 = this.LLLI;
        if (str3 == null) {
            str3 = "";
        }
        map.put("room_id", str3);
        map.put("previous_page", "order_detail");
        map.put("page_name", "video_receipt");
        map.put("enter_from", str);
        map.put("enter_from_info", str);
        String str4 = this.LLLIIII;
        if (str4 != null) {
            str2 = str4;
        }
        map.put("order_id", str2);
        Map<String, ? extends Object> map2 = this.LLLIIIIL;
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    public final void ZR(boolean z) {
        long j = this.LLL;
        if (j <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("duration", Integer.valueOf((int) jCurrentTimeMillis)), new Pair("is_success", Boolean.valueOf(z)), new Pair("is_forward", Boolean.valueOf(this.LLLF)), new Pair("trigger_by", "manual"));
        VR(mapLJIIJ);
        C1018703yb.LIZIZ("rd_tiktokec_replay_seek", mapLJIIJ);
        this.LLL = 0L;
        this.LLLF = false;
    }

    public final String aS(long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = 60;
        return C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
    }

    public final void dS(boolean z) {
        boolean z2;
        boolean z3;
        if (this.LLJLILLLLZIIL) {
            return;
        }
        long j = this.LLJLL;
        long j2 = 0;
        if (j <= 0) {
            return;
        }
        boolean z4 = true;
        this.LLJLILLLLZIIL = true;
        if (this.LLJJJJJIL) {
            C21354518hb c21354518hb = this.LLJJIJIL;
            if (c21354518hb != null) {
                Integer numValueOf = Integer.valueOf(c21354518hb.LIZ.LIZIZ());
                if (numValueOf.intValue() >= 0) {
                    this.LLJLLL = numValueOf.intValue();
                }
            }
            C21354518hb c21354518hb2 = this.LLJJIJIL;
            if (c21354518hb2 != null) {
                Integer numValueOf2 = Integer.valueOf(c21354518hb2.LIZ.LJIIJJI);
                if (numValueOf2.intValue() >= 0) {
                    this.LLJZ = numValueOf2.intValue();
                }
            }
        } else if (this.LLJLLL < 0 && this.LLJLLIL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLLIL;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            this.LLJLLL = (int) jCurrentTimeMillis;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis2 >= 0) {
            j2 = jCurrentTimeMillis2;
        }
        int i = (int) j2;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("duration", Integer.valueOf(i));
        pairArr[1] = new Pair("api_duration", Integer.valueOf(this.LLJLLL));
        pairArr[2] = new Pair("preload_duration", Integer.valueOf(this.LLJZ));
        pairArr[3] = new Pair("is_success", Boolean.valueOf(z));
        pairArr[4] = new Pair("use_cache", Boolean.valueOf(this.LLJJJJJIL));
        C21354518hb c21354518hb3 = this.LLJJIJIL;
        if (c21354518hb3 != null && c21354518hb3.LIZ.LJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        pairArr[5] = new Pair("is_reuse_cache", Boolean.valueOf(z2));
        C21354518hb c21354518hb4 = this.LLJJIJIL;
        if (c21354518hb4 != null && c21354518hb4.LIZ.LIZLLL == EnumC1569640qws.NORMAL) {
            z3 = true;
        } else {
            z3 = false;
        }
        pairArr[6] = new Pair("cache_ready", Boolean.valueOf(z3));
        C21354518hb c21354518hb5 = this.LLJJIJIL;
        if (c21354518hb5 == null || !c21354518hb5.LIZ.LJIIJ) {
            z4 = false;
        }
        pairArr[7] = new Pair("pre_render_ready", Boolean.valueOf(z4));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        VR(mapLJIIJ);
        C1018703yb.LIZIZ("rd_tiktokec_replay_first_frame", mapLJIIJ);
    }

    public final void iS(long j) {
        TextView textView;
        if (this.LLLFF > 0 && (textView = this.LLILZIL) != null) {
            textView.setText(C786410Ut5.k4(Locale.US, "%s/%s", Arrays.copyOf(new Object[]{aS(j), this.LLLFFI}, 2)));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b19738", (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x027f A[PHI: r2 r16
      0x027f: PHI (r2v19 int) = (r2v14 int), (r2v20 int) binds: [B:152:0x0398, B:109:0x027d] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r16v7 boolean) = (r16v3 boolean), (r16v8 boolean) binds: [B:152:0x0398, B:109:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d A[PHI: r8
      0x029d: PHI (r8v4 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:117:0x0292, B:121:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038d A[PHI: r8
      0x038d: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String), (r8v5 java.lang.String) binds: [B:115:0x028e, B:123:0x02a0, B:121:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039c A[PHI: r2 r16
      0x039c: PHI (r2v15 int) = (r2v14 int), (r2v19 int) binds: [B:152:0x0398, B:111:0x0281] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r16v4 boolean) = (r16v3 boolean), (r16v7 boolean) binds: [B:152:0x0398, B:111:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bvq, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public static void hS(ECLiveVideoReplayFragment eCLiveVideoReplayFragment, String str, String str2, int i) {
        AFwS231S0000000_3 aFwS231S0000000_3 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(290);
        }
        Pair[] pairArr = new Pair[5];
        String str3 = eCLiveVideoReplayFragment.LLLIIIL;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[0] = new Pair("item_id", str3);
        pairArr[1] = new Pair("step", str);
        pairArr[2] = new Pair("is_multi_bitrate", Boolean.valueOf(eCLiveVideoReplayFragment.LLLILZJ));
        pairArr[3] = new Pair("bitrate_count", Integer.valueOf(eCLiveVideoReplayFragment.LLLILZLLLI));
        pairArr[4] = new Pair("is_fallback", Boolean.valueOf(eCLiveVideoReplayFragment.LLLIZZ));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        eCLiveVideoReplayFragment.VR(mapLJIIJ);
        if (str2 != null && str2.length() > 0) {
            mapLJIIJ.put("error_code", str2);
        }
        aFwS231S0000000_3.getClass();
        C1018703yb.LIZIZ("rd_tiktokec_live_replay_step_event", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(X.C188G r19, X.C1488750oqP r20, X.C21354518hb r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayFragment.WR(X.188G, X.0oqP, X.18hb, boolean):void");
    }

    public static void gS(ECLiveVideoReplayFragment eCLiveVideoReplayFragment, Integer num, String str, C1488610oqB c1488610oqB, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        Function1 function1 = c1488610oqB;
        if ((i & 4) != 0) {
            function1 = AFwS231S0000000_3.get$arr$(289);
        }
        Pair[] pairArr = new Pair[1];
        String str2 = eCLiveVideoReplayFragment.LLLIIIL;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("item_id", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        eCLiveVideoReplayFragment.VR(mapLJIIJ);
        if (num != null) {
            mapLJIIJ.put("error_code", Integer.valueOf(num.intValue()));
        }
        if (str != null && str.length() > 0) {
            mapLJIIJ.put("error_msg", str);
        }
        function1.invoke(mapLJIIJ);
        C1018703yb.LIZIZ("rd_tiktokec_replay_error", mapLJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.0ogN, X.18hR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS(final com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo r30, long r31, X.C1488750oqP r33, final X.C21354518hb r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayFragment.bS(com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo, long, X.0oqP, X.18hb, boolean):void");
    }
}
