package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C035C;
import X.C09JN;
import X.C0NT8;
import X.C11S5;
import X.C1323820kYO;
import X.C14EU;
import X.C1548820qPI;
import X.C1701940uOG;
import X.C19660511w3;
import X.C19EG;
import X.C2188811AlT;
import X.C262100zr;
import X.C397901gf;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import Y.ACListenerS113S0200000_9;
import Y.AfS105S0300000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.api.LiveTaskApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveTaskBarBottomBarAssem extends BaseCellSlotComponent<LiveTaskBarBottomBarAssem> implements InterfaceC1141530foN {
    public ConstraintLayout LLJLLIL;
    public Aweme LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public int LLLF = -1;
    public int LLLFF = -1;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_a;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final boolean Vo() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        this.LLJZ = true;
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        this.LLJZ = false;
        this.LLJZIJLIL = false;
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    public LiveTaskBarBottomBarAssem() {
        C1548820qPI.LIZLLL("LiveAcademyTaskPanelEvent", this);
        C1548820qPI.LIZLLL("LiveAcademyTaskGoLiveFromPreviewPage", this);
    }

    public final boolean Bp(Aweme aweme) {
        TextView textView;
        Resources resources;
        Resources resources2;
        Resources resources3;
        String string;
        if (getContext() == null) {
            return false;
        }
        ConstraintLayout constraintLayout = this.LLJLLIL;
        String string2 = null;
        if (constraintLayout != null) {
            textView = (TextView) constraintLayout.findViewById(R.id.n8_);
        } else {
            textView = null;
        }
        if (this.LLLF >= 0 && this.LLLFF > 0) {
            if (textView != null) {
                Context context = getContext();
                if (context == null || (resources3 = context.getResources()) == null || (string = resources3.getString(2131843190, Integer.valueOf(this.LLLF), Integer.valueOf(this.LLLFF))) == null) {
                    return false;
                }
                textView.setText(C786410Ut5.j4(string, Arrays.copyOf(new Object[0], 0)));
            }
            ConstraintLayout constraintLayout2 = this.LLJLLIL;
            if (constraintLayout2 != null) {
                C786410Ut5.LL(0, constraintLayout2);
            }
            return true;
        }
        C0NT8 c0nt8 = C0NT8.LIZ;
        String aid = aweme.getAid();
        c0nt8.getClass();
        int iLIZIZ = C0NT8.LIZIZ(aid);
        if (iLIZIZ != 0) {
            if (iLIZIZ == 1 && textView != null) {
                Context context2 = getContext();
                if (context2 != null && (resources2 = context2.getResources()) != null) {
                    string2 = resources2.getString(2131843183);
                }
                textView.setText(string2);
            }
        } else if (textView != null) {
            Context context3 = getContext();
            if (context3 != null && (resources = context3.getResources()) != null) {
                string2 = resources.getString(2131843182);
            }
            textView.setText(string2);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Activity activity;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "LiveAcademyTaskPanelEvent")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                String string = interfaceC1107590evd.getString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                if (Intrinsics.LJFF(string, "close")) {
                    this.LLJZIJLIL = false;
                    return;
                } else {
                    if (!Intrinsics.LJFF(string, "open")) {
                        return;
                    }
                    this.LLJZIJLIL = true;
                    return;
                }
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "LiveAcademyTaskGoLiveFromPreviewPage")) {
            return;
        }
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(new JSONObject()), "close_front_page_in_livePreviewPage"));
        Context context = getContext();
        if (!(context instanceof Activity) || (activity = (Activity) context) == null || !Intrinsics.LJFF("com.ss.android.ugc.aweme.detail.ui.DetailActivity", activity.getClass().getCanonicalName())) {
            return;
        }
        activity.finish();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShowTasks(C035C c035c) {
        String aid;
        Aweme aweme = c035c.LIZ;
        if (aweme != null) {
            String aid2 = aweme.getAid();
            Aweme aweme2 = this.LLJLLL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid) && c035c.LIZIZ >= 90.0f) {
                this.LLL = true;
                Aweme aweme3 = c035c.LIZ;
                if (aweme3 != null && this.LLJZ && aweme3.getAid() != null) {
                    C0NT8 c0nt8 = C0NT8.LIZ;
                    String aid3 = aweme3.getAid();
                    c0nt8.getClass();
                    HashMap map = (HashMap) C0NT8.LJIIJJI;
                    Object obj = map.get(aid3);
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.LJFF(obj, bool) && this.LLL && (getContext() instanceof C19EG)) {
                        this.LLL = false;
                        if (!TextUtils.isEmpty(aweme3.getAid())) {
                            map.put(aweme3.getAid(), bool);
                            LiveTaskApi liveTaskApi = LiveTaskApi.LIZ;
                            String aid4 = aweme3.getAid();
                            liveTaskApi.getClass();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("https://");
                            sbLIZ.append(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLIIIJ());
                            ((LiveTaskApi.RealApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(LiveTaskApi.RealApi.class)).finishTask(aid4, 1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS105S0300000_9(this, aweme3, aweme3, 1), new C09JN() { // from class: X.08DD
                                @Override // X.C09JN
                                public final void accept(Object obj2) {
                                    C1C7U.LIZ("LiveTaskBarBottomBarAssem@c786.unlockTask$2");
                                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("LiveTaskBarBottomBarAssem", "finish task failed!");
                                    C1C7U.LIZIZ("LiveTaskBarBottomBarAssem@c786.unlockTask$2");
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.em2);
        this.LLJLLIL = constraintLayout;
        if (constraintLayout != null) {
            setComponentClickStatusExperimental(constraintLayout, EnumC700430Rdh.POSITIVE);
        }
        view.findViewById(R.id.n8_);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        int iIntValue;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJLLL = videoItemParams2.getAweme();
        Aweme aweme = videoItemParams2.getAweme();
        Aweme aweme2 = videoItemParams2.getAweme();
        if (Intrinsics.LJFF(videoItemParams2.mEventType, "live_center")) {
            C0NT8 c0nt8 = C0NT8.LIZ;
            String aid = aweme2.getAid();
            c0nt8.getClass();
            if (((HashMap) C0NT8.LJIIJ).containsKey(aid)) {
                ConstraintLayout constraintLayout = this.LLJLLIL;
                if (constraintLayout != null) {
                    C786410Ut5.Y7(constraintLayout, new ACListenerS113S0200000_9(this, aweme, 52));
                }
                Integer num = C19660511w3.LIZLLL;
                int iIntValue2 = -1;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                this.LLLF = iIntValue;
                Integer num2 = C19660511w3.LJ;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                }
                this.LLLFF = iIntValue2;
                if (Bp(aweme)) {
                    C0NT8.LIZ.getClass();
                    C0NT8.LJ(aweme, true);
                    return;
                }
                return;
            }
        }
        C1548820qPI.LJIIIIZZ("LiveAcademyTaskPanelEvent", this);
        C1548820qPI.LJIIIIZZ("LiveAcademyTaskGoLiveFromPreviewPage", this);
        ConstraintLayout constraintLayout2 = this.LLJLLIL;
        if (constraintLayout2 == null) {
            return;
        }
        C786410Ut5.LL(8, constraintLayout2);
    }
}
