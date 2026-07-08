package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.AbstractC848400XPy;
import X.C08CX;
import X.C0LAB;
import X.C0XQ7;
import X.C13LP;
import X.C1403110mcH;
import X.C20684815ws;
import X.C2217571Bql;
import X.C2217581Bqm;
import X.C2217591Bqn;
import X.C786410Ut5;
import Y.ACListenerS136S0200000_34;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleEventObserver;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.HighQualityBoostInfoV2;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes35.dex */
public final class PhotoModeAfterCreationFeedbackBottomBarAssem extends BaseCellSlotComponent<PhotoModeAfterCreationFeedbackBottomBarAssem> implements LifecycleEventObserver {
    public long LLJLLIL = -1;
    public Pair<Integer, Integer> LLJLLL;
    public boolean LLJZ;
    public ViewGroup LLJZIJLIL;
    public TuxTextView LLL;
    public VideoItemParams LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b50;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.trr);
        this.LLJZIJLIL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        this.LLL = (TuxTextView) view.findViewById(R.id.y3j);
        getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        String string;
        HighQualityBoostInfoV2 highQualityBoostInfoV2LIZIZ;
        Long l;
        Long l2;
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLLF = videoItemParams2;
        this.LLJLLIL = -1L;
        if (C2217571Bql.LIZJ(videoItemParams2.getAweme())) {
            ViewGroup viewGroup = this.LLJZIJLIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView != null) {
                HighQualityBoostInfoV2 highQualityBoostInfoV2LIZIZ2 = C2217571Bql.LIZIZ(videoItemParams2.getAweme());
                if (highQualityBoostInfoV2LIZIZ2 != null && (str = highQualityBoostInfoV2LIZIZ2.description) != null) {
                    tuxTextView.setText(str);
                } else {
                    return;
                }
            }
            TuxTextView tuxTextView2 = this.LLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setMaxLines(2);
            }
            TuxTextView tuxTextView3 = this.LLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
            }
            Aweme aweme = videoItemParams2.getAweme();
            C0LAB c0lab = new C0LAB();
            String string2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
                HighQualityBoostInfoV2 highQualityBoostInfoV2LIZIZ3 = C2217571Bql.LIZIZ(aweme);
                if (highQualityBoostInfoV2LIZIZ3 != null && (l2 = highQualityBoostInfoV2LIZIZ3.hotRequestCount) != null) {
                    string = l2.toString();
                }
                highQualityBoostInfoV2LIZIZ = C2217571Bql.LIZIZ(aweme);
                if (highQualityBoostInfoV2LIZIZ != null && (l = highQualityBoostInfoV2LIZIZ.photoQueueHotRequestCnt) != null) {
                    string2 = l.toString();
                }
                C1403110mcH.LIZIZ(c0lab, "personal_video_detail_page", aid, string, string2, "show", null);
                C20684815ws.LJIILLIIL("info_photo_boosted_banner", c0lab.LIZ);
                C2217581Bqm c2217581BqmLIZIZ = C2217591Bqn.LIZIZ();
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                c2217581BqmLIZIZ.getClass();
                this.LLJLLL = new Pair<>(Integer.valueOf(c2217581BqmLIZIZ.LIZ().getInt(C2217591Bqn.LJII(curUserId), C2217591Bqn.LIZ().uidDailyMaxExposureLevel1)), Integer.valueOf(c2217581BqmLIZIZ.LIZ().getInt(C2217591Bqn.LJIIIIZZ(curUserId), 0)));
                C2217581Bqm c2217581BqmLIZIZ2 = C2217591Bqn.LIZIZ();
                String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                String aid2 = videoItemParams2.getAweme().getAid();
                String aid3 = videoItemParams2.getAweme().getAid();
                c2217581BqmLIZIZ2.LIZJ(curUserId2);
                c2217581BqmLIZIZ2.LIZ().storeInt(C2217591Bqn.LJI(curUserId2), c2217581BqmLIZIZ2.LIZ().getInt(C2217591Bqn.LJI(curUserId2), 0) + 1);
                int i = c2217581BqmLIZIZ2.LIZ().getInt(C786410Ut5.j4("gid_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId2, aid2}, 2)), 0) + 1;
                String strJ4 = C786410Ut5.j4("gid_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId2, aid2}, 2));
                c2217581BqmLIZIZ2.LIZ().storeInt(strJ4, i);
                Keva kevaLIZ = c2217581BqmLIZIZ2.LIZ();
                String strLJFF = C2217591Bqn.LJFF(curUserId2);
                C08CX c08cx = C2217581Bqm.LIZIZ;
                Set<String> setLLIIIZ = C13LP.LLIIIZ(kevaLIZ.getStringSet(strLJFF, c08cx));
                setLLIIIZ.add(strJ4);
                kevaLIZ.storeStringSet(strLJFF, setLLIIIZ);
                int i2 = c2217581BqmLIZIZ2.LIZ().getInt(C786410Ut5.j4("item_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId2, aid3}, 2)), 0) + 1;
                String strJ42 = C786410Ut5.j4("item_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId2, aid3}, 2));
                c2217581BqmLIZIZ2.LIZ().storeInt(strJ42, i2);
                Keva kevaLIZ2 = c2217581BqmLIZIZ2.LIZ();
                String strLJFF2 = C2217591Bqn.LJFF(curUserId2);
                Set<String> setLLIIIZ2 = C13LP.LLIIIZ(kevaLIZ2.getStringSet(strLJFF2, c08cx));
                setLLIIIZ2.add(strJ42);
                kevaLIZ2.storeStringSet(strLJFF2, setLLIIIZ2);
                C786410Ut5.I7(new ACListenerS136S0200000_34(this, videoItemParams2, 10), getContentView());
                return;
            }
            aid = null;
            string = null;
            if (aweme != null) {
                highQualityBoostInfoV2LIZIZ = C2217571Bql.LIZIZ(aweme);
                if (highQualityBoostInfoV2LIZIZ != null) {
                    string2 = l.toString();
                }
            }
            C1403110mcH.LIZIZ(c0lab, "personal_video_detail_page", aid, string, string2, "show", null);
            C20684815ws.LJIILLIIL("info_photo_boosted_banner", c0lab.LIZ);
            C2217581Bqm c2217581BqmLIZIZ3 = C2217591Bqn.LIZIZ();
            String curUserId3 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            c2217581BqmLIZIZ3.getClass();
            this.LLJLLL = new Pair<>(Integer.valueOf(c2217581BqmLIZIZ3.LIZ().getInt(C2217591Bqn.LJII(curUserId3), C2217591Bqn.LIZ().uidDailyMaxExposureLevel1)), Integer.valueOf(c2217581BqmLIZIZ3.LIZ().getInt(C2217591Bqn.LJIIIIZZ(curUserId3), 0)));
            C2217581Bqm c2217581BqmLIZIZ22 = C2217591Bqn.LIZIZ();
            String curUserId22 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            String aid22 = videoItemParams2.getAweme().getAid();
            String aid32 = videoItemParams2.getAweme().getAid();
            c2217581BqmLIZIZ22.LIZJ(curUserId22);
            c2217581BqmLIZIZ22.LIZ().storeInt(C2217591Bqn.LJI(curUserId22), c2217581BqmLIZIZ22.LIZ().getInt(C2217591Bqn.LJI(curUserId22), 0) + 1);
            int i3 = c2217581BqmLIZIZ22.LIZ().getInt(C786410Ut5.j4("gid_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId22, aid22}, 2)), 0) + 1;
            String strJ43 = C786410Ut5.j4("gid_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId22, aid22}, 2));
            c2217581BqmLIZIZ22.LIZ().storeInt(strJ43, i3);
            Keva kevaLIZ3 = c2217581BqmLIZIZ22.LIZ();
            String strLJFF3 = C2217591Bqn.LJFF(curUserId22);
            C08CX c08cx2 = C2217581Bqm.LIZIZ;
            Set<String> setLLIIIZ3 = C13LP.LLIIIZ(kevaLIZ3.getStringSet(strLJFF3, c08cx2));
            setLLIIIZ3.add(strJ43);
            kevaLIZ3.storeStringSet(strLJFF3, setLLIIIZ3);
            int i22 = c2217581BqmLIZIZ22.LIZ().getInt(C786410Ut5.j4("item_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId22, aid32}, 2)), 0) + 1;
            String strJ422 = C786410Ut5.j4("item_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId22, aid32}, 2));
            c2217581BqmLIZIZ22.LIZ().storeInt(strJ422, i22);
            Keva kevaLIZ22 = c2217581BqmLIZIZ22.LIZ();
            String strLJFF22 = C2217591Bqn.LJFF(curUserId22);
            Set<String> setLLIIIZ22 = C13LP.LLIIIZ(kevaLIZ22.getStringSet(strLJFF22, c08cx2));
            setLLIIIZ22.add(strJ422);
            kevaLIZ22.storeStringSet(strLJFF22, setLLIIIZ22);
            C786410Ut5.I7(new ACListenerS136S0200000_34(this, videoItemParams2, 10), getContentView());
            return;
        }
        ViewGroup viewGroup2 = this.LLJZIJLIL;
        if (viewGroup2 == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    @Override // androidx.lifecycle.LifecycleEventObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStateChanged(androidx.lifecycle.LifecycleOwner r12, androidx.lifecycle.Lifecycle.Event r13) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PhotoModeAfterCreationFeedbackBottomBarAssem.onStateChanged(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
    }
}
