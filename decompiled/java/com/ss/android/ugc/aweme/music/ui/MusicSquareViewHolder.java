package com.ss.android.ugc.aweme.music.ui;

import X.AbstractC468201s0;
import X.C013C;
import X.C1176850gjL;
import X.C123100dR;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1398180mUK;
import X.C1398240mUQ;
import X.C13LP;
import X.C1419640n2w;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2211751BhN;
import X.C418440Gaw;
import X.C424560Gko;
import X.C426750GoL;
import X.C461720I8s;
import X.C584710MwX;
import X.C630310Ont;
import X.C636090OxD;
import X.C786410Ut5;
import X.InterfaceC1260110itd;
import X.InterfaceC1398220mUO;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.ab.MdpShowSquareABSwitchConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAwemeListAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import irm.AkS59S0200000_21;
import irm.AkS89S0100000_21;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class MusicSquareViewHolder extends C1398240mUQ {
    public static final Map<Integer, Integer> LLLIZZ = new LinkedHashMap();
    public final InterfaceC1398220mUO LLLI;
    public final Keva LLLII;
    public final TuxIconView LLLIIII;
    public boolean LLLIIIIL;
    public final String LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public ObjectAnimator LLLILZ;
    public String LLLILZJ;
    public final C1398180mUK LLLILZLLLI;

    public final void T6() {
        Music music = this.LL.getMusic();
        if (music == null) {
            return;
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.fn8);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.fmx);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        if (music.isMdpSquareCollected()) {
            tuxTextView.setText(this.itemView.getContext().getString(2131848620));
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            return;
        }
        if (!C123100dR.LIZ(music.mdpSquareRecommendTag())) {
            int iFollowUpCount = music.followUpCount();
            tuxTextView.setText(this.itemView.getContext().getResources().getQuantityString(2131755220, iFollowUpCount, C1176850gjL.LIZ(1, Integer.valueOf(iFollowUpCount), CardStruct.IStatusCode.DEFAULT).toString()));
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            return;
        }
        if (music.mdpSquareRecommendTag().equals("hot")) {
            tuxIconView.setIconRes(R.raw.icon_color_streak_light);
        } else {
            tuxIconView.setIconRes(R.raw.icon_color_arrow_broken_line_up_fill_ltr);
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        int iFollowUpCount2 = music.followUpCount();
        tuxTextView.setText(this.itemView.getContext().getResources().getQuantityString(2131755220, iFollowUpCount2, C1176850gjL.LIZ(1, Integer.valueOf(iFollowUpCount2), CardStruct.IStatusCode.DEFAULT).toString()));
        C786410Ut5.LLLLZLL(tuxTextView, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    @Override // X.C1398240mUQ, X.InterfaceC1401180mZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            r5 = this;
            android.view.View r0 = r5.itemView
            r4 = 0
            if (r0 == 0) goto L84
            X.0Q7z r1 = X.C1558360qeg.LJ(r0, r4)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility> r0 = com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility r0 = (com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility) r0
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.SQ1()
            if (r0 == 0) goto L84
            java.lang.String r1 = r0.getAid()
        L1d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LL
            if (r0 == 0) goto L82
            java.lang.String r0 = r0.getAid()
        L25:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L73
            android.view.View r0 = r5.itemView
            if (r0 == 0) goto L80
            X.0Q7z r1 = X.C1558360qeg.LJ(r0, r4)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility> r0 = com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility r0 = (com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility) r0
            if (r0 == 0) goto L80
            long r0 = r0.getCurrentPosition()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L45:
            java.lang.String r0 = X.C584710MwX.LIZJ
            int r0 = r0.length()
            if (r0 == 0) goto L5d
            java.lang.String r1 = X.C584710MwX.LIZJ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LL
            if (r0 == 0) goto L7e
            java.lang.String r0 = r0.getAid()
        L57:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L73
        L5d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LL
            java.lang.String r3 = r0.getAid()
            if (r2 == 0) goto L6e
            long r1 = r2.longValue()
            int r0 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L6e:
            java.lang.String r0 = "video"
            X.C584710MwX.LIZIZ(r4, r3, r0)
        L73:
            super.onPause()
            com.bytedance.tux.icon.TuxIconView r1 = r5.LLLIIII
            r0 = 8
            X.C786410Ut5.LLLLLLZZ(r1, r0)
            return
        L7e:
            r0 = r4
            goto L57
        L80:
            r2 = r4
            goto L45
        L82:
            r0 = r4
            goto L25
        L84:
            r1 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder.onPause():void");
    }

    @Override // X.C1398240mUQ, X.C1398250mUR, X.InterfaceC1401180mZA
    public final void i2(int i) {
        String aid;
        String str = C584710MwX.LIZJ;
        Aweme aweme = this.LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            C584710MwX.LIZJ = "";
        }
        super.i2(i);
        C786410Ut5.LLLLLLZZ(this.LLLIIII, 0);
    }

    public void K6(int i, Aweme aweme) {
        final String str;
        Video video;
        UrlModel cover;
        List<String> urlList;
        final View viewFindViewById = this.itemView.findViewById(R.id.ccm);
        ((TextView) this.itemView.findViewById(R.id.ccn)).setText(this.itemView.getContext().getString(2131848618));
        if (aweme == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            str = "";
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, this.itemView.getContext());
        if (numLIZJ != null) {
            viewFindViewById.setBackgroundColor(numLIZJ.intValue());
        }
        if (str.length() > 0) {
            this.LLLILZJ = str;
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIJL(viewFindViewById.getContext());
            c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.09mB
                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    int iIntValue;
                    if (bitmap != null && Intrinsics.LJFF(this.LL.LLLILZJ, str)) {
                        Map<Integer, Integer> map = MusicSquareViewHolder.LLLIZZ;
                        Integer num = (Integer) ((LinkedHashMap) map).get(Integer.valueOf(this.LL.LLLILZJ.hashCode()));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            this.LL.getClass();
                            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
                            c204674156yLIZ.LJFF(0.0f);
                            c204674156yLIZ.LJ(0.0f, 0.24f, 0.36f, 0.46f, 0.0f);
                            c204674156yLIZ.LJI(0.0f);
                            Integer numLIZIZ = c204674156yLIZ.LIZIZ();
                            if (numLIZIZ != null) {
                                iIntValue = numLIZIZ.intValue();
                            } else {
                                iIntValue = -16777216;
                            }
                        }
                        MusicSquareViewHolder musicSquareViewHolder = this.LL;
                        View view = viewFindViewById;
                        map.put(Integer.valueOf(musicSquareViewHolder.LLLILZJ.hashCode()), Integer.valueOf(iIntValue));
                        view.setBackgroundColor(iIntValue);
                    }
                }
            });
        }
        C786410Ut5.I7(new AkS59S0200000_21(viewFindViewById, this, 9), viewFindViewById);
    }

    public void L6(int i, Aweme aweme) {
        UrlModel coverMedium;
        String str;
        List<String> urlList;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, this.itemView.getContext());
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, this.itemView.getContext());
        View viewFindViewById = this.itemView.findViewById(R.id.y_o);
        if (numLIZJ != null && numLIZJ2 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{numLIZJ.intValue(), numLIZJ2.intValue()});
            gradientDrawable.setGradientType(0);
            viewFindViewById.setBackground(gradientDrawable);
        }
        C424560Gko c424560Gko = (C424560Gko) this.itemView.findViewById(R.id.fn1);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.fo7);
        Music music = this.LL.getMusic();
        if (music != null) {
            if (C630310Ont.LIZIZ(music)) {
                coverMedium = C630310Ont.LIZLLL(music);
            } else {
                coverMedium = music.getCoverMedium();
            }
            c424560Gko.setPlaceholderImage(C1308910kAL.LJ(R.attr.a02, this.itemView.getContext()));
            if (coverMedium != null && (urlList = coverMedium.getUrlList()) != null) {
                str = (String) C13LP.LJJJLL(urlList);
            } else {
                str = null;
            }
            c424560Gko.setImageURI(str);
            c424560Gko.setCornerRadius(C418440Gaw.LIZIZ(6));
            if (!C426750GoL.LIZLLL(this.itemView.getContext())) {
                tuxTextView.setTextDirection(3);
                tuxTextView.setLayoutDirection(0);
            }
            tuxTextView.setText(C1419640n2w.LIZ(this.itemView.getContext(), music.convertToMusicModel()));
        }
        S6(i, tuxTextView);
        T6();
        View viewFindViewById2 = this.itemView.findViewById(R.id.y_n);
        C786410Ut5.I7(new AkS59S0200000_21(viewFindViewById2, this, 10), viewFindViewById2);
    }

    public final void S6(int i, TuxTextView tuxTextView) {
        List<MusicAwemeList.MDPDetailInfo> list;
        MusicAwemeList musicAwemeListNC2;
        List<? extends MusicAwemeList.MDPDetailInfo> listLLIIII = null;
        IMDPAwemeListAbility iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IMDPAwemeListAbility.class, null);
        if (iMDPAwemeListAbility != null && (musicAwemeListNC2 = iMDPAwemeListAbility.nC2()) != null) {
            list = musicAwemeListNC2.detailInfos;
        } else {
            list = null;
        }
        this.LLLILZLLLI.LJ = String.valueOf(i);
        C1398180mUK c1398180mUK = this.LLLILZLLLI;
        if (list != null) {
            listLLIIII = C13LP.LLIIII(list);
        }
        c1398180mUK.LJFF = listLLIIII;
        C2211751BhN.LIZ(tuxTextView, this.LLLILZLLLI);
    }

    public MusicSquareViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd, InterfaceC1398220mUO interfaceC1398220mUO) {
        String uid;
        super(view, str, interfaceC1260110itd);
        this.LLLI = interfaceC1398220mUO;
        this.LLLII = Keva.getRepo("music_detail_page");
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.oy4);
        this.LLLIIII = tuxIconView;
        this.LLLIIIIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL != null) {
            uid = userLIZLLL.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        sbLIZ.append("mdp_square_mute_play");
        this.LLLIIIL = C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C2211631BhB.LJ(view, new AwS600S0100000_21(this, 155));
        this.LLLILZJ = "";
        this.LLLILZLLLI = new C1398180mUK(this);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder$bindAweme$lifecycleObserver$1] */
    @Override // X.C1398630mV3, X.AbstractC1261240ivS
    public final void X5(final Aweme aweme, int i, boolean z, Bundle bundle) {
        ObjectAnimator objectAnimator;
        b6(aweme, i, z, bundle);
        this.LLJZ = aweme;
        z6(aweme, i, z, bundle);
        boolean z2 = this.LLLII.getBoolean(this.LLLIIIL, ((MdpShowSquareABSwitchConfig) C636090OxD.LIZIZ.getValue()).videoMuted);
        this.LLLIIIIL = z2;
        L6(i, aweme);
        K6(i, aweme);
        C786410Ut5.Fb(this.LLLIIII, 0.0f);
        ObjectAnimator objectAnimator2 = this.LLLILZ;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLLILZ) != null) {
            objectAnimator.cancel();
        }
        this.LLLIIL = false;
        if (z2) {
            this.LLLIIII.setIconRes(R.raw.icon_speaker_2_slash_ltr);
        } else {
            this.LLLIIII.setIconRes(R.raw.icon_speaker_2_ltr);
        }
        C786410Ut5.I7(new AkS89S0100000_21(this, 5), this.LLLIIII);
        this.LLLIILIL = false;
        final C013C c013c = new C013C();
        final ?? r2 = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder$bindAweme$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                } else if (event == Lifecycle.Event.ON_PAUSE) {
                    onPause();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                this.LL.LLLIL = true;
                c013c.element = true;
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                MusicSquareViewHolder musicSquareViewHolder = this.LL;
                musicSquareViewHolder.LLLIL = false;
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    musicSquareViewHolder.LLLIILIL = true;
                }
                c013c2.element = false;
            }
        };
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0mSy
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Lifecycle lifecycleDy;
                MusicSquareViewHolder musicSquareViewHolder = this.LL;
                musicSquareViewHolder.LLLIILIL = false;
                IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(musicSquareViewHolder.itemView, null), IMDPMobAbility.class, null);
                if (iMDPMobAbility != null && (lifecycleDy = iMDPMobAbility.dy()) != null) {
                    lifecycleDy.addObserver(r2);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Lifecycle lifecycleDy;
                MusicSquareViewHolder musicSquareViewHolder = this.LL;
                musicSquareViewHolder.LLLIILIL = false;
                IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(musicSquareViewHolder.itemView, null), IMDPMobAbility.class, null);
                if (iMDPMobAbility != null && (lifecycleDy = iMDPMobAbility.dy()) != null) {
                    lifecycleDy.removeObserver(r2);
                }
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    C584710MwX.LIZIZ(0, aweme2.getAid(), "video");
                }
            }
        });
    }
}
