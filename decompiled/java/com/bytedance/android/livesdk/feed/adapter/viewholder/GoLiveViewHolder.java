package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.C0GSW;
import X.C0IJT;
import X.C0P0T;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C13LP;
import X.C1533950q1J;
import X.C16F5;
import X.C1819620xS4;
import X.C417200GXm;
import X.C474500IjA;
import X.C486690J6t;
import X.C786410Ut5;
import X.C842240X2g;
import X.InterfaceC2262081DgM;
import X.InterfaceC472640IgA;
import Y.ACListenerS142S0100000_7;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class GoLiveViewHolder extends DrawerFollowingViewHolder {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final InterfaceC472640IgA LLIZ;
    public long LLIZLLLIL;
    public C0P0T LLJ;
    public int LLJI;
    public final String LLJIJIL;
    public C1324720kZq LLJILJIL;
    public ViewGroup LLJILJILJ;
    public C0GSW LLJILLL;
    public C16F5 LLJJ;
    public ViewGroup LLJJI;
    public View LLJJIII;
    public final Keva LLJJIJI;
    public Integer LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public long LLJJJ;

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void clearAnimation() {
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void L5() {
        N5("livesdk_live_entrance_show").LIZ();
    }

    public final int P5() {
        Integer num = this.LLJJIJIIJIL;
        int iIntValue = num != null ? num.intValue() : this.LLJJIJI.getInt("toplive_golive_anim_style", 0);
        if (!this.LLJJIJIL && System.currentTimeMillis() - this.LLJJJ >= 2000) {
            return 0;
        }
        return iIntValue;
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void onViewDetachedFromWindow() {
        moveToStopState();
        this.LLJ = null;
        this.LLJJIJIL = false;
        this.LLJJJ = -1L;
    }

    public final C474500IjA N5(String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(this.LLJIJIL, "live_entrance_name");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJJIJI.getInt("toplive_golive_anim_style", 0)), "guidance_type");
        C486690J6t.LIZJ.getValue().getClass();
        if (Intrinsics.LJFF(null, "golive_guide")) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_show_tooltip");
        return c474500IjALIZ;
    }

    public GoLiveViewHolder(View view, InterfaceC472640IgA interfaceC472640IgA) {
        super(view, null);
        this.LLIZ = interfaceC472640IgA;
        this.LLJIJIL = "toplive_live_cover_camera";
        this.LLJJIJI = Keva.getRepo("ttlive_preview_repo");
        this.LLJJJ = -1L;
    }

    public final void R5(int i, boolean z) {
        Object obj;
        Object obj2;
        C0P0T c0p0t = this.LLJ;
        if (((c0p0t == null || !c0p0t.isShowing()) && System.currentTimeMillis() - this.LLIZLLLIL >= 2000) || i <= 0) {
            i = P5();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_from", this.LLJIJIL);
        jSONObject.put("toplive_guidance_type", String.valueOf(i));
        C486690J6t.LIZJ.getValue().getClass();
        String str = "1";
        if (Intrinsics.LJFF(null, "golive_guide")) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("toplive_guidance_is_show_tooltip", obj);
        if (z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("click_position", obj2);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(this.itemView.getContext(), new Uri.Builder().scheme("sslocal").authority("openRecord").appendQueryParameter("enter_from", "direct_shoot").appendQueryParameter("tab", "live").appendQueryParameter("source_params", C786410Ut5.J3(jSONObject)).build().toString(), new Bundle());
        C474500IjA c474500IjAN5 = N5("livesdk_live_entrance_click");
        if (!z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjAN5.LJJII(str, "click_position");
        c474500IjAN5.LJJII(String.valueOf(i), "guidance_type");
        c474500IjAN5.LIZ();
        InterfaceC472640IgA interfaceC472640IgA = this.LLIZ;
        if (interfaceC472640IgA != null) {
            interfaceC472640IgA.LIZLLL();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder
    public final void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i) {
        ImageModel avatarThumb;
        List<String> listLIZ;
        C417200GXm c417200GXm;
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 54), this.itemView);
        this.LLJILJILJ = (ViewGroup) this.itemView.findViewById(R.id.lcy);
        this.LLJILLL = (C0GSW) this.itemView.findViewById(R.id.ln2);
        this.LLJJI = (ViewGroup) this.itemView.findViewById(R.id.mtt);
        this.LLJJIII = this.itemView.findViewById(R.id.n9m);
        C16F5 c16f5 = (C16F5) this.itemView.findViewById(R.id.zym);
        this.LLJJ = c16f5;
        String str2 = null;
        if ((c16f5 instanceof C417200GXm) && (c417200GXm = (C417200GXm) c16f5) != null) {
            c417200GXm.setProgress(1.0f);
        }
        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
        if (curUser != null && (avatarThumb = curUser.getAvatarThumb()) != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null) {
            str2 = (String) C13LP.LJJJLL(listLIZ);
        }
        this.LLJILJIL = (C1324720kZq) this.itemView.findViewById(R.id.ld7);
        if (C1533950q1J.LJ(str2)) {
            C1324720kZq c1324720kZq = this.LLJILJIL;
            if (c1324720kZq != null) {
                C1819620xS4.LIZ().setUrl(str2).LJJI(c1324720kZq);
            }
        } else {
            C1324720kZq c1324720kZq2 = this.LLJILJIL;
            if (c1324720kZq2 != null) {
                c1324720kZq2.setImageResource(R.drawable.eze);
            }
        }
        if (this.LLJJIJI.getLong("toplive_golive_bubble_show_time_v2", -1L) != -1 && System.currentTimeMillis() - this.LLJJIJI.getLong("toplive_golive_bubble_show_time_v2", -1L) < 86400000 && this.LLJJIJI.getInt("toplive_golive_anim_style", 0) != 0 && this.LLJJIJI.getInt("toplive_golive_anim_style", 0) == 1) {
            ViewGroup viewGroup = this.LLJILJILJ;
            if (viewGroup != null) {
                C786410Ut5.Lb(0.0f, viewGroup);
            }
            ViewGroup viewGroup2 = this.LLJILJILJ;
            if (viewGroup2 != null) {
                C786410Ut5.mc(0.0f, viewGroup2);
            }
        }
    }
}
