package com.ss.android.ugc.aweme.feed.assem.story;

import X.C01GW;
import X.C0OAD;
import X.C337180DJs;
import X.C452501pT;
import X.C497820Jfg;
import X.C729980SkG;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SocialProhibitedTipComponent extends BaseCellSlotComponent<SocialProhibitedTipComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 255));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b96;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C337180DJs.LIZ(getContentView());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void Bp(String str) {
        View view;
        int iLIZIZ = 0;
        if ((str == null || str.length() == 0) && (view = (View) this.LLJLLIL.getValue()) != null) {
            C337180DJs.LIZ(view);
        }
        View view2 = (View) this.LLJLLIL.getValue();
        if (view2 != null) {
            C337180DJs.LIZJ(view2);
        }
        TextView textView = (TextView) this.LLJLLIL.getValue();
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                iLIZIZ = C497820Jfg.LIZIZ(context);
            }
            textView.setWidth((int) (iLIZIZ * 0.56f));
        }
        TextView textView2 = (TextView) this.LLJLLIL.getValue();
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        Aweme aweme;
        if (!AwemeExtKt.isSharedStoryVisible(videoItemParams.getAweme()) || AwemeExtKt.isCommentPostInvisible(videoItemParams.getAweme()) || ((C729980SkG.LJIIIIZZ(videoItemParams.getAweme()) && (aweme = videoItemParams.getAweme()) != null && AwemeExtKt.isProhibited(aweme)) || C0OAD.LIZIZ(videoItemParams.getAweme()))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        int i;
        Aweme aweme = videoItemParams.getAweme();
        if (C0OAD.LIZIZ(aweme)) {
            Bp(aweme.getTakeDownDesc());
            return;
        }
        String string = null;
        if (AwemeExtKt.isSharedStoryVisible(aweme) && !AwemeExtKt.isCommentPostInvisible(aweme)) {
            if (C729980SkG.LJIIIIZZ(aweme) && AwemeExtKt.isProhibited(aweme)) {
                String videoDetailNotice = AwemeExtKt.getVideoDetailNotice(aweme);
                if (videoDetailNotice.length() == 0) {
                    Context context = getContext();
                    if (context != null) {
                        string = context.getString(2131858174);
                    }
                    videoDetailNotice = string;
                }
                Bp(videoDetailNotice);
                return;
            }
            Bp(null);
            return;
        }
        if (C729980SkG.LJIIIIZZ(aweme) && AwemeExtKt.getVideoDetailNotice(aweme).length() > 0) {
            string = AwemeExtKt.getVideoDetailNotice(aweme);
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                if (aweme.getIsCommentPostVideo()) {
                    i = 2131824820;
                } else {
                    i = 2131847916;
                }
                string = context2.getString(i);
            }
        }
        Bp(string);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
