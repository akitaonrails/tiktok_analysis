package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.C086I;
import X.C0RD4;
import X.C12ES;
import X.C1388190mED;
import X.C1402480mbG;
import X.C15GM;
import X.C15H0;
import X.C15H8;
import X.C15HK;
import X.C15HN;
import X.C15HO;
import X.C15HP;
import X.C15HQ;
import X.C15HR;
import X.C15IK;
import X.C15IP;
import X.C15IQ;
import X.C15J0;
import X.C19EG;
import X.C2188811AlT;
import X.C2241008qG;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C793770VBv;
import X.C794240VDq;
import X.InterfaceC20494515Hj;
import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ChallengeMusicWidget extends ListItemWidget<C15HR> implements Observer<C0RD4> {
    public Fragment LLJ;
    public Challenge LLJI;
    public C15H0 LLJIJIL;
    public int LLJILJIL = -1;
    public int LLJILJILJ;
    public C15HO LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public InterfaceC20494515Hj<C15HP> LLJJIII;
    public C15GM LLJJIJI;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIIZILJ() {
        Challenge challenge = this.LLJI;
        if (challenge == null) {
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL.itemView);
            return;
        }
        List<MusicModel> listLIZ = C15J0.LIZ(challenge.getConnectMusics());
        C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL.itemView);
        C15HN c15hn = (C15HN) this.LLIZLLLIL;
        Challenge challenge2 = this.LLJI;
        int iIntValue = ((Integer) this.LLILZ.get("music_position", -1)).intValue();
        int i = this.LLJILJIL;
        String str = (String) this.LLILZ.get("challenge_id", null);
        C15HQ c15hq = new C15HQ() { // from class: X.15Hf
            @Override // X.C15HQ
            public final void LIZ(C15IP c15ip, View view, MusicModel musicModel, int i2) {
                final ChallengeMusicWidget challengeMusicWidget = this.LIZ;
                challengeMusicWidget.getClass();
                int id = view.getId();
                if (id == R.id.lox) {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null) {
                        activityLJFF.getString(2131834437);
                    }
                    if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                        C629710Omv.LIZIZ(C2214201BlK.LJFF(), C15J0.LIZLLL(i2));
                        return;
                    } else {
                        c15ip.L5();
                        C15IK.LJII(c15ip.LLJJLIIIJLLLLLLLZ, musicModel, challengeMusicWidget.LLJILLL, c15ip.LLJLLIL, musicModel.getLogPb());
                        return;
                    }
                }
                if (id == R.id.lp1) {
                    if (musicModel == null) {
                        return;
                    }
                    if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(2131837770);
                        }
                        C1233040iBy c1233040iBy = new C1233040iBy(view.getContext());
                        c1233040iBy.LIZJ(offlineDesc);
                        c1233040iBy.LIZLLL();
                        return;
                    }
                    if (!C142I.LIZ(musicModel, view.getContext(), true)) {
                        return;
                    }
                    String string = UUID.randomUUID().toString();
                    C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://music/detail/");
                    sbLIZ.append(musicModel.getMusicId());
                    C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
                    c686150Qvl.LIZIZ("process_id", string);
                    c19724912FjLIZLLL.LJII(c686150Qvl.LIZJ());
                    C15HO c15ho = new C15HO("change_music_page", "attached_song", "click_button", C15IK.LIZ);
                    c15ho.LJI = (String) challengeMusicWidget.LLILZ.get("challenge_id", null);
                    C15IK.LJIIIIZZ(c15ho, musicModel.getMusicId(), false, string);
                    return;
                }
                if (id == R.id.nfe) {
                    ChooseMusicSelectView chooseMusicSelectView = C20494415Hi.LIZ;
                    if (chooseMusicSelectView != null) {
                        chooseMusicSelectView.LIZIZ();
                    }
                    if (challengeMusicWidget.LLJILJIL == c15ip.LLJLLIL && ((Integer) challengeMusicWidget.LLILZ.get("music_position", -1)).intValue() == -2) {
                        challengeMusicWidget.LLILZ.zQ2(-1, "music_position");
                        challengeMusicWidget.LLILZ.zQ2(-1, "music_index");
                        c15ip.a6(false, false, false);
                        challengeMusicWidget.LLJIJIL.p8(null);
                        return;
                    }
                    C15H0 c15h0 = challengeMusicWidget.LLJIJIL;
                    if (c15h0 != null) {
                        c15h0.p8(null);
                        C15IK.LIZLLL = c15ip.LLJLLIL;
                        new C15HO("change_music_page", "attached_song", "", C15IK.LIZ);
                        challengeMusicWidget.LLJIJIL.Dl0(new C15IZ() { // from class: X.15HZ
                            @Override // X.C15IZ
                            public final void LIZ() {
                                challengeMusicWidget.LLILZ.zQ2(Boolean.FALSE, "music_loading");
                            }
                        });
                        challengeMusicWidget.LLJIJIL.cJ(musicModel, challengeMusicWidget.LLJILLL);
                    }
                    challengeMusicWidget.LLILZ.zQ2(-2, "music_position");
                    challengeMusicWidget.LLILZ.zQ2(Integer.valueOf(c15ip.LLJLLIL), "music_index");
                    challengeMusicWidget.LLILZ.zQ2(Boolean.TRUE, "music_loading");
                    return;
                }
                if (id == R.id.njf) {
                    C15GM c15gm = challengeMusicWidget.LLJJIJI;
                    if (c15gm != null) {
                        ((BaseNewMusicTabFragment) c15gm).LLJJJJ = 10;
                    }
                    if (musicModel == null) {
                        return;
                    }
                    MusicModel musicModelM317clone = musicModel.m317clone();
                    if (challengeMusicWidget.LLJIJIL == null || challengeMusicWidget.LLJILLL == null) {
                        return;
                    }
                    musicModelM317clone.setEditFrom("");
                    challengeMusicWidget.LLJIJIL.ru(musicModelM317clone);
                    C15IK.LJIJ(challengeMusicWidget.LLJILLL, musicModelM317clone, c15ip.LLJLLIL, musicModelM317clone.getLogPb());
                    return;
                }
                if (id != R.id.loz) {
                    return;
                }
                challengeMusicWidget.LLILZ.zQ2(-1, "music_position");
                challengeMusicWidget.LLILZ.zQ2(-1, "music_index");
                c15ip.a6(false, false, false);
                challengeMusicWidget.LLJIJIL.p8(null);
                C15HO c15ho2 = challengeMusicWidget.LLJILLL;
                c15ho2.LIZJ = "change_music";
                c15ho2.LJIIJ = C15IK.LIZIZ(c15ho2.LIZLLL);
                ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C1659630tI1.LJ(challengeMusicWidget.LLJ).get(ChooseMusicCutViewModel.class);
                chooseMusicCutViewModel.wQ2().postValue(musicModel);
                chooseMusicCutViewModel.vQ2().postValue(challengeMusicWidget.LLJILLL);
            }
        };
        InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = this.LLJJIII;
        boolean z = (this.LLJJ == 0 && this.LLJJI == 0) ? false : true;
        if (challenge2 == null) {
            c15hn.getClass();
            return;
        }
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(c15hn.LLILLJJLI);
        String challengeName = challenge2.getChallengeName();
        c15hn.LLILZIL.setText(c15hn.LLILLJJLI.getString(2131845816).replace("%s", ""));
        if (C444960Hcc.LIZJ(c15hn.LLILLJJLI)) {
            c15hn.LLILZLL.setGravity(5);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("#");
        sbLIZ.append(challengeName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        UrlModel urlModelLJIIL = ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIL(strLIZIZ, true, true);
        if (urlModelLJIIL != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new StyleSpan(1), 0, strLIZIZ.length(), 17);
        if (urlModelLJIIL != null) {
            ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIJI(challengeName, urlModelLJIIL, spannableString, c15hn.LLILZLL, "basedon_music_hashtag");
        } else {
            c15hn.LLILZLL.setText(spannableString);
        }
        c15hn.LLJI.LJI = str;
        ArrayList<MusicModel> arrayList = (ArrayList) listLIZ;
        int size = arrayList.size() - c15hn.LLIZ.getChildCount();
        for (int i2 = 0; i2 < size; i2++) {
            C15IP c15ip = new C15IP(c15hn.LLJ, C786410Ut5.Td(layoutInflaterNe, R.layout.cx5, c15hn.LLIZ, false), false);
            ((ArrayList) c15hn.LLILLL).add(c15ip);
            c15ip.itemView.setPadding(0, 0, 0, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c15ip.LLJJIII.getLayoutParams();
            marginLayoutParams.bottomMargin = (int) C12ES.LIZJ(2.0f, c15ip.LLJL);
            marginLayoutParams.topMargin = (int) C12ES.LIZJ(2.0f, c15ip.LLJL);
            c15ip.LLJJIII.requestLayout();
            C786410Ut5.LJLLLLLL(8, c15ip.LLJJIJIIJIL);
            c15ip.LLJI.requestLayout();
            c15hn.LLIZ.addView(c15ip.itemView);
        }
        int i3 = 0;
        while (i3 < ((ArrayList) c15hn.LLILLL).size()) {
            C15IP c15ip2 = (C15IP) ListProtector.get(c15hn.LLILLL, i3);
            c15ip2.T5(new C15IQ((MusicModel) ListProtector.get(listLIZ, i3), "", false, false, ((MusicModel) ListProtector.get(listLIZ, i3)).hasExtendMusicList(), iIntValue == -2 && i3 == i, z, 0, 0, i3, c15hn.LLJI, C1402480mbG.LIZ(), 0, false, false, false));
            c15ip2.LLLI = c15hq;
            c15ip2.LLLIL = interfaceC20494515Hj;
            MusicModel musicModel = (MusicModel) ListProtector.get(listLIZ, i3);
            if (musicModel != null && musicModel.getLogPb() != null) {
                c15hn.LLJI.LJIIIIZZ = musicModel.getLogPb();
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c15hn.LLILLJJLI);
            if (c19egLIZIZ != null) {
                C15IK.LJIIL(new C15HK(c15hn.itemView, musicModel, Integer.valueOf(i3)), c19egLIZIZ, c15hn.LLJI, musicModel, i3, true, false, null);
            }
            i3++;
        }
        String shootWay = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getShootWay();
        AVChallenge curChallenge = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getCurChallenge();
        if (!TextUtils.equals(shootWay, "challenge") || curChallenge == null || C086I.LIZIZ(listLIZ) || !curChallenge.isCommerce) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (MusicModel musicModel2 : arrayList) {
            if (musicModel2 != null) {
                arrayList2.add(musicModel2.getMusicId());
            }
        }
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("shoot_way", shootWay);
        c2241008qG.LIZ.put("challenge_id", curChallenge.cid);
        c2241008qG.LIZ.put("music_ids", arrayList2.toString());
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("music_recommendations_monitor", 0, jSONObjectLJ);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        DataCenter dataCenter = this.LLILZ;
        dataCenter.yQ2("data_challenge", this, false);
        dataCenter.yQ2("music_index", this, false);
        dataCenter.yQ2("music_collect_status", this, false);
        dataCenter.yQ2("music_loading", this, false);
        dataCenter.yQ2("music_reset_play_start", this, false);
        ((Integer) this.LLILZ.get("key_choose_music_type")).intValue();
        super.onCreate();
        C15HO c15ho = new C15HO("change_music_page", "attached_song", "", C15IK.LIZ);
        this.LLJILLL = c15ho;
        c15ho.LJI = (String) this.LLILZ.get("challenge_id", null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILL(C15H8 c15h8) {
        this.LLIZLLLIL = c15h8;
        this.LLJI = (Challenge) this.LLILZ.get("data_challenge");
        LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C15HR) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0157, code lost:
    
        if (r5.equals("music_reset_play_start") == false) goto L6;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C0RD4 r12) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget.onChanged(java.lang.Object):void");
    }
}
