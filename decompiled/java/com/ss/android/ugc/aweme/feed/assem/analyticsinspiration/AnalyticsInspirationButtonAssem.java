package com.ss.android.ugc.aweme.feed.assem.analyticsinspiration;

import X.C01GW;
import X.C0R1G;
import X.C1389890mGx;
import X.C14EU;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import Y.ACListenerS114S0200000_10;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class AnalyticsInspirationButtonAssem extends BaseCellSlotComponent<AnalyticsInspirationButtonAssem> {
    public C197039127h LLJLLIL;
    public VideoItemParams LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 184));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_2;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final boolean Vo() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoadMoreEmptyEvent(C0R1G c0r1g) {
        Object obj;
        VideoItemParams videoItemParams;
        C19EG c19egLIZ;
        String string;
        Object obj2;
        String str;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "creation_inspiration") && (videoItemParams = this.LLJLLL) != null && videoItemParams.currentPosition == ((Number) this.LLJZ.getValue()).intValue() - 1 && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            try {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                str = ((VideoItemParams) obj2).trackerData;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (str != null) {
                string = JSONObjectProtectorUtils.getString(new JSONObject(str), "inspiration_tab");
            } else {
                string = null;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(2131826541);
            c1389890mGx.LJIIJJI();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("category_name", string);
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            c2344009Gk.LJIIIIZZ("group_id", ((VideoItemParams) obj3).getAweme().getGroupId());
            C20684815ws.LJIILLIIL("creation_inspiration_feed_scroll_end_show", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        Object obj2;
        String string;
        super.onViewCreated(view);
        this.LLJLLIL = (C197039127h) view.findViewById(R.id.vz0);
        C724270Sb3 c724270Sb3 = this.LLJI;
        C197039127h c197039127h = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "creator_series_outreach")) {
            C197039127h c197039127h2 = this.LLJLLIL;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131847387);
            } else {
                string = null;
            }
            c197039127h2.setText(string);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "creator_series_outreach");
            c2344009Gk.LJIIIIZZ("shoot_way", "series_promo_education");
            C20684815ws.LJIILLIIL("show_post_video_button", c2344009Gk.LIZ);
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        if (Intrinsics.LJFF(((VideoItemParams) obj2).mEventType, "creation_inspiration")) {
            C197039127h c197039127h3 = this.LLJLLIL;
            if (c197039127h3 == null) {
                c197039127h3 = null;
            }
            c197039127h3.setButtonStartIcon(Integer.valueOf(R.raw.icon_video_fill));
        }
        C197039127h c197039127h4 = this.LLJLLIL;
        if (c197039127h4 == null) {
            c197039127h4 = null;
        }
        setComponentClickStatusExperimental(c197039127h4, EnumC700430Rdh.POSITIVE);
        C197039127h c197039127h5 = this.LLJLLIL;
        if (c197039127h5 != null) {
            c197039127h = c197039127h5;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS114S0200000_10(view, this, 4));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        this.LLJLLL = videoItemParams;
    }
}
