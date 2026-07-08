package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.C0IKQ;
import X.C0RD4;
import X.C1388190mED;
import X.C1402480mbG;
import X.C15GM;
import X.C15H0;
import X.C15H8;
import X.C15HK;
import X.C15HL;
import X.C15HO;
import X.C15HP;
import X.C15HQ;
import X.C15HS;
import X.C15IK;
import X.C15IP;
import X.C15IQ;
import X.C15J0;
import X.C19EG;
import X.C786410Ut5;
import X.InterfaceC20494515Hj;
import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes32.dex */
public class StickerMusicWidget extends ListItemWidget<C15HS> implements Observer<C0RD4> {
    public Fragment LLJ;
    public C15H0 LLJI;
    public int LLJIJIL = -1;
    public List<Music> LLJILJIL;
    public int LLJILJILJ;
    public C15HO LLJILLL;
    public InterfaceC20494515Hj<C15HP> LLJJ;
    public C15GM LLJJI;
    public long LLJJIII;
    public long LLJJIJI;

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIIZILJ() {
        if (C0IKQ.LIZ(this.LLJILJIL)) {
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL.itemView);
            return;
        }
        List<MusicModel> listLIZ = C15J0.LIZ(this.LLJILJIL);
        C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL.itemView);
        C15HL c15hl = (C15HL) this.LLIZLLLIL;
        int iIntValue = ((Integer) this.LLILZ.get("music_position", -1)).intValue();
        int i = this.LLJIJIL;
        boolean zBooleanValue = ((Boolean) this.LLILZ.get("data_sticker_music_from_video", Boolean.FALSE)).booleanValue();
        String str = (String) this.LLILZ.get("sticker_id", null);
        C15HQ c15hq = new C15HQ() { // from class: X.15Hd
            @Override // X.C15HQ
            public final void LIZ(C15IP c15ip, View view, MusicModel musicModel, int i2) {
                final StickerMusicWidget stickerMusicWidget = this.LIZ;
                stickerMusicWidget.getClass();
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
                        C15IK.LJII(c15ip.LLJJLIIIJLLLLLLLZ, musicModel, stickerMusicWidget.LLJILLL, c15ip.LLJLLIL, musicModel.getLogPb());
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
                    C15IK.LJIIIIZZ(new C15HO("change_music_page", "attached_song", "click_button", C15IK.LIZ), musicModel.getMusicId(), false, string);
                    return;
                }
                if (id == R.id.nfe) {
                    ChooseMusicSelectView chooseMusicSelectView = C20494415Hi.LIZ;
                    if (chooseMusicSelectView != null) {
                        chooseMusicSelectView.LIZIZ();
                    }
                    if (stickerMusicWidget.LLJIJIL == c15ip.LLJLLIL && ((Integer) stickerMusicWidget.LLILZ.get("music_position", -1)).intValue() == -2) {
                        stickerMusicWidget.LLILZ.zQ2(-1, "music_position");
                        stickerMusicWidget.LLILZ.zQ2(-1, "music_index");
                        stickerMusicWidget.LLJI.p8(null);
                        return;
                    }
                    C15H0 c15h0 = stickerMusicWidget.LLJI;
                    if (c15h0 != null) {
                        c15h0.p8(null);
                        C15IK.LIZLLL = c15ip.LLJLLIL;
                        C15HO c15ho = new C15HO("change_music_page", "prop", "", C15IK.LIZ);
                        c15ho.LJFF = (String) stickerMusicWidget.LLILZ.get("sticker_id", null);
                        stickerMusicWidget.LLJI.Dl0(new C15IZ() { // from class: X.15Ha
                            @Override // X.C15IZ
                            public final void LIZ() {
                                stickerMusicWidget.LLILZ.zQ2(Boolean.FALSE, "music_loading");
                            }
                        });
                        stickerMusicWidget.LLJI.cJ(musicModel, c15ho);
                    }
                    stickerMusicWidget.LLILZ.zQ2(-2, "music_position");
                    stickerMusicWidget.LLILZ.zQ2(Integer.valueOf(c15ip.LLJLLIL), "music_index");
                    stickerMusicWidget.LLILZ.zQ2(Boolean.TRUE, "music_loading");
                    return;
                }
                if (id == R.id.njf) {
                    C15GM c15gm = stickerMusicWidget.LLJJI;
                    if (c15gm != null) {
                        ((BaseNewMusicTabFragment) c15gm).LLJJJJ = 9;
                    }
                    if (musicModel == null) {
                        return;
                    }
                    MusicModel musicModelM317clone = musicModel.m317clone();
                    if (stickerMusicWidget.LLJI == null) {
                        return;
                    }
                    String str2 = stickerMusicWidget.LLJILLL.LJ;
                    if (C2093608Ic.LJ(str2)) {
                        str2 = "";
                    }
                    musicModelM317clone.setCategoryID(str2);
                    musicModelM317clone.setEditFrom("");
                    stickerMusicWidget.LLJI.ru(musicModelM317clone);
                    C15IK.LJIJ(stickerMusicWidget.LLJILLL, musicModelM317clone, c15ip.LLJLLIL, musicModelM317clone.getLogPb());
                    return;
                }
                if (id != R.id.loz) {
                    return;
                }
                stickerMusicWidget.LLILZ.zQ2(-1, "music_position");
                stickerMusicWidget.LLILZ.zQ2(-1, "music_index");
                c15ip.a6(false, false, false);
                stickerMusicWidget.LLJI.p8(null);
                C15HO c15ho2 = stickerMusicWidget.LLJILLL;
                c15ho2.LIZJ = "change_music";
                c15ho2.LJIIJ = C15IK.LIZIZ(c15ho2.LIZLLL);
                ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C1659630tI1.LJ(stickerMusicWidget.LLJ).get(ChooseMusicCutViewModel.class);
                chooseMusicCutViewModel.vQ2().postValue(stickerMusicWidget.LLJILLL);
                chooseMusicCutViewModel.wQ2().postValue(musicModel);
            }
        };
        InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = this.LLJJ;
        boolean z = (this.LLJJIII == 0 && this.LLJJIJI == 0) ? false : true;
        if (c15hl.LLJIJIL) {
            c15hl.LLILZLL.setText(2131845825);
        } else if (c15hl.LLJI) {
            c15hl.LLILZLL.setText(2131845817);
        } else if (zBooleanValue) {
            c15hl.LLILZLL.setText(2131839041);
        } else {
            c15hl.LLILZLL.setText(2131845818);
        }
        int size = ((ArrayList) listLIZ).size() - c15hl.LLILZIL.getChildCount();
        c15hl.LLJ.LJFF = str;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(c15hl.LLILLJJLI);
        for (int i2 = 0; i2 < size; i2++) {
            C15IP c15ip = new C15IP(c15hl.LLIZLLLIL, C786410Ut5.Td(layoutInflaterNe, R.layout.cx5, c15hl.LLILZIL, false), C1402480mbG.LIZ());
            ((ArrayList) c15hl.LLILLL).add(c15ip);
            c15ip.itemView.setPadding(0, 0, 0, 0);
            c15hl.LLILZIL.addView(c15ip.itemView);
        }
        int i3 = 0;
        while (i3 < ((ArrayList) c15hl.LLILLL).size()) {
            C15IP c15ip2 = (C15IP) ListProtector.get(c15hl.LLILLL, i3);
            c15ip2.T5(new C15IQ((MusicModel) ListProtector.get(listLIZ, i3), "", false, false, ((MusicModel) ListProtector.get(listLIZ, i3)).hasExtendMusicList(), -2 == iIntValue && i3 == i, z, 0, 0, i3, c15hl.LLJ, C1402480mbG.LIZ(), 0, false, false, false));
            c15ip2.LLLI = c15hq;
            c15ip2.LLLIL = interfaceC20494515Hj;
            MusicModel musicModel = (MusicModel) ListProtector.get(listLIZ, i3);
            if (musicModel != null) {
                if (musicModel.getLogPb() != null) {
                    c15hl.LLJ.LJIIIIZZ = musicModel.getLogPb();
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(c15hl.LLILLJJLI);
                if (c19egLIZIZ != null) {
                    C15IK.LJIIL(new C15HK(c15hl.itemView, musicModel, Integer.valueOf(i3)), c19egLIZIZ, c15hl.LLJ, musicModel, i3, true, false, null);
                }
            }
            i3++;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        DataCenter dataCenter = this.LLILZ;
        dataCenter.yQ2("data_sticker", this, false);
        dataCenter.yQ2("music_index", this, false);
        dataCenter.yQ2("music_collect_status", this, false);
        dataCenter.yQ2("music_loading", this, false);
        dataCenter.yQ2("music_reset_play_start", this, false);
        ((Integer) this.LLILZ.get("key_choose_music_type")).intValue();
        super.onCreate();
        C15HO c15ho = new C15HO("change_music_page", "attached_song", "", C15IK.LIZ);
        this.LLJILLL = c15ho;
        c15ho.LIZIZ = "prop";
        c15ho.LJFF = (String) this.LLILZ.get("sticker_id", null);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILL(C15H8 c15h8) {
        this.LLIZLLLIL = c15h8;
        this.LLJILJIL = (List) this.LLILZ.get("data_sticker", null);
        LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C15HS) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget.onChanged(java.lang.Object):void");
    }
}
