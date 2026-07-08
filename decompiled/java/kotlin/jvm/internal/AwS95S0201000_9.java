package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0BLB;
import X.C0C64;
import X.C0HTI;
import X.C0NB9;
import X.C0NBA;
import X.C0OGJ;
import X.C0OKY;
import X.C0P4S;
import X.C1171920gbO;
import X.C1238740iLA;
import X.C1391600mJi;
import X.C1391810mK3;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LP;
import X.C1440005kM;
import X.C1668306g5;
import X.C1697810uHb;
import X.C19EG;
import X.C20248014Ko;
import X.C20684815ws;
import X.C2097608Jq;
import X.C450860Hm8;
import X.C617210OIt;
import X.C618380ONg;
import X.C629660Omq;
import X.C629690Omt;
import X.C629770On1;
import X.C629780On2;
import X.C724240Sb0;
import X.EnumC1235690iGF;
import X.InterfaceC1891350zJl;
import X.InterfaceC20660615sy;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class AwS95S0201000_9 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v71, types: [X.0Otu] */
    public static final Object invoke$0(AwS95S0201000_9 awS95S0201000_9, Object obj) {
        MusicModel musicModelConvertToMusicModel;
        String str;
        String musicId;
        boolean zBooleanValue;
        boolean z;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Fragment fragment;
        BaseFragment baseFragment;
        Boolean boolValueOf;
        Music music;
        C629660Omq c629660Omq = (C629660Omq) obj;
        String str2 = ((MusicFavoriteButtonAssem) awS95S0201000_9.l0).sp().LLILLL;
        if (str2 != null) {
            MusicDetail musicDetailLIZ = c629660Omq.LL.LIZ();
            if (musicDetailLIZ != null && (music = musicDetailLIZ.music) != null) {
                music.setCollectStatus(awS95S0201000_9.i2);
                musicModelConvertToMusicModel = music.convertToMusicModel();
            } else {
                musicModelConvertToMusicModel = null;
            }
            C629770On1 c629770On1 = new C629770On1(musicModelConvertToMusicModel, awS95S0201000_9.i2);
            c629770On1.LIZJ = "music_detail";
            C1440005kM.LIZ(c629770On1);
            final boolean z2 = false;
            C1440005kM.LIZ(new C0OGJ(str2, awS95S0201000_9.i2, false));
            MobClick mobClickObtain = MobClick.obtain();
            final boolean z3 = true;
            if (awS95S0201000_9.i2 == 1) {
                str = "collection_music_cancel";
            } else {
                str = "collection_music";
            }
            mobClickObtain.setEventName(str);
            mobClickObtain.setLabelName("single_song");
            if (musicModelConvertToMusicModel != null) {
                musicId = musicModelConvertToMusicModel.getMusicId();
            } else {
                musicId = null;
            }
            mobClickObtain.setValue(String.valueOf(musicId));
            mobClickObtain.setExtValueLong(0L);
            C20684815ws.onEvent(mobClickObtain);
            C19EG c19egLIZ = C724240Sb0.LIZ((MusicFavoriteButtonAssem) awS95S0201000_9.l0);
            if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (!listLJJLIIIJL.isEmpty()) && (fragment = (Fragment) C13LP.LJJJLL(listLJJLIIIJL)) != null && (fragment instanceof MusicDetailFragment) && (baseFragment = (BaseFragment) fragment) != null && (boolValueOf = Boolean.valueOf(baseFragment.isActive())) != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = true;
            }
            if (awS95S0201000_9.i2 == 1 && zBooleanValue) {
                if (C0BLB.LIZ() >= 2 && !Intrinsics.LJFF(((MusicFavoriteButtonAssem) awS95S0201000_9.l0).LLJJJJ.getValue(), "personal_homepage")) {
                    Pair[] pairArr = new Pair[3];
                    Object value = ((MusicFavoriteButtonAssem) awS95S0201000_9.l0).LLJJJIL.getValue();
                    if (value == null) {
                        value = "";
                    }
                    pairArr[0] = new Pair("group_id", value);
                    pairArr[1] = new Pair("music_id", str2);
                    pairArr[2] = new Pair("enter_from", "single_song");
                    final Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    C629780On2 c629780On2Mp = ((MusicFavoriteButtonAssem) awS95S0201000_9.l0).mp();
                    final C19EG c19egLIZ2 = C724240Sb0.LIZ((MusicFavoriteButtonAssem) awS95S0201000_9.l0);
                    final Fragment fragment2 = (Fragment) awS95S0201000_9.l1;
                    View contentView = ((MusicFavoriteButtonAssem) awS95S0201000_9.l0).getContentView();
                    c629780On2Mp.getClass();
                    if (C0BLB.LIZ() >= 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && c629780On2Mp.LIZ.getBoolean("key_music_favorite_revisit_guide_dialog", true)) {
                        c629780On2Mp.LIZ.storeBoolean("key_music_favorite_revisit_guide_dialog", false);
                        C1171920gbO.LIZ.getClass();
                        if (c19egLIZ2 != null && fragment2 != null) {
                            PopupManager.LJIIZILJ(new C629690Omt(new InterfaceC20660615sy() { // from class: X.0Otu
                                @Override // X.InterfaceC20660615sy
                                public final boolean t2() {
                                    return true;
                                }

                                @Override // X.InterfaceC20658015sY
                                public final boolean Xu() {
                                    return fragment2.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
                                }

                                @Override // X.InterfaceC20658015sY
                                public final C688120Qyw i2() {
                                    return new C688120Qyw(c19egLIZ2, fragment2, null);
                                }

                                @Override // X.InterfaceC20658015sY
                                public final String getSceneId() {
                                    return C634060Otw.LIZ(this);
                                }
                            }, c19egLIZ2, mapLJIIIIZZ), new C1668306g5("feed_music_detail_revisit_guide_trigger"));
                            C0NB9.LIZ(new C0NBA() { // from class: X.0Omr
                                @Override // X.C0NBA
                                public final void LIZ(C0NBB c0nbb) throws JSONException {
                                    String str3;
                                    Map<String, ? extends Object> map = mapLJIIIIZZ;
                                    boolean z4 = z3;
                                    c0nbb.LIZIZ(map);
                                    if (z4) {
                                        str3 = "favourite_song_first";
                                    } else {
                                        str3 = "favourite_song";
                                    }
                                    c0nbb.LIZ("toast_type", str3);
                                }
                            }, "favourite_notice_show");
                        }
                    } else if (fragment2 != null) {
                        C1171920gbO.LIZ.getClass();
                        if (c19egLIZ2 != null) {
                            C450860Hm8 c450860Hm8 = new C450860Hm8(contentView.getContext());
                            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.BOTTOM;
                            C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
                            c1391600mJi.LIZLLL = enumC1235690iGF;
                            c1391600mJi.LJII = 3000L;
                            c1391600mJi.LIZIZ = contentView;
                            c450860Hm8.LJIIJ(new AwS372S0200000_6(c19egLIZ2, (C19EG) mapLJIIIIZZ, (Map<String, ? extends Object>) 50));
                            C20248014Ko.LIZ(fragment2, c450860Hm8.LIZIZ());
                            C0NB9.LIZ(new C0NBA() { // from class: X.0Omr
                                @Override // X.C0NBA
                                public final void LIZ(C0NBB c0nbb) throws JSONException {
                                    String str3;
                                    Map<String, ? extends Object> map = mapLJIIIIZZ;
                                    boolean z4 = z2;
                                    c0nbb.LIZIZ(map);
                                    if (z4) {
                                        str3 = "favourite_song_first";
                                    } else {
                                        str3 = "favourite_song";
                                    }
                                    c0nbb.LIZ("toast_type", str3);
                                }
                            }, "favourite_notice_show");
                        }
                    }
                } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_music_detail_page_interaction_opt", true) == 0) {
                    MusicFavoriteButtonAssem musicFavoriteButtonAssem = (MusicFavoriteButtonAssem) awS95S0201000_9.l0;
                    C629780On2 c629780On2Mp2 = musicFavoriteButtonAssem.mp();
                    boolean zLIZJ = c629780On2Mp2.LIZ.getBoolean(C629780On2.LIZ("need_show_collect_succed_dialog_%s"), true);
                    if (zLIZJ && !(zLIZJ = C1238740iLA.LIZJ("music_sp").LIZJ("is_need_show_collect_succed_dialog", true))) {
                        c629780On2Mp2.LIZ.storeBoolean(C629780On2.LIZ("need_show_collect_succed_dialog_%s"), zLIZJ);
                        C1238740iLA.LIZJ("music_sp").LIZLLL().remove("is_need_show_collect_succed_dialog").apply();
                    }
                    C19EG c19egLIZ3 = C724240Sb0.LIZ(musicFavoriteButtonAssem);
                    if (c19egLIZ3 != null) {
                        if (zLIZJ) {
                            musicFavoriteButtonAssem.LLJJLIIIJLLLLLLLZ = true;
                            musicFavoriteButtonAssem.mp().LIZ.storeBoolean(C629780On2.LIZ("need_show_collect_succed_dialog_%s"), false);
                            C1397620mTQ c1397620mTQ = new C1397620mTQ(c19egLIZ3);
                            c1397620mTQ.LJFF(2131837649, null);
                            C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ3);
                            c1397580mTM.LIZ(2131825168);
                            c1397580mTM.LJFF(R.string.cpj);
                            c1397580mTM.LJIIL = c1397620mTQ;
                            C0HTI c0hti = new C0HTI();
                            c0hti.LIZ = R.drawable.tg;
                            c1397580mTM.LJIIIZ = new C1391810mK3(0, c19egLIZ3, c0hti.LIZ(c19egLIZ3));
                            c1397580mTM.LIZLLL = new C0P4S(musicFavoriteButtonAssem, 7);
                            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                            C1391850mK7.LIZIZ(c1397510mTF, "musicdetailpage_music_add_to_favorites_remind_dialog");
                            c1397510mTF.LIZLLL();
                        } else if (!musicFavoriteButtonAssem.LLJL) {
                            musicFavoriteButtonAssem.LLJL = true;
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS95S0201000_9 awS95S0201000_9, Object obj) {
        C617210OIt c617210OIt;
        BulletinFunctionSetting bulletinFunctionSetting;
        BulletinFunctionSetting bulletinFunctionSetting2 = (BulletinFunctionSetting) awS95S0201000_9.l0;
        BulletinFunctionSetting bulletinFunctionSettingCopy = bulletinFunctionSetting2.copy(bulletinFunctionSetting2.functionType, bulletinFunctionSetting2.name, awS95S0201000_9.i2);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : ((C0OKY) obj).LLJJ) {
            if ((interfaceC1891350zJl instanceof C617210OIt) && (bulletinFunctionSetting = (c617210OIt = (C617210OIt) interfaceC1891350zJl).LL) != null && bulletinFunctionSetting.functionType == bulletinFunctionSettingCopy.functionType) {
                arrayList.add(new C617210OIt(bulletinFunctionSettingCopy, c617210OIt.LLILLJJLI, c617210OIt.LLILLL, c617210OIt.LLILZ));
            } else {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        ((BulletinProfileViewModel) awS95S0201000_9.l1).setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 520));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS95S0201000_9 awS95S0201000_9, Object obj) {
        BulletinBizResourceEntryToggle bulletinBizResourceEntryToggle;
        BulletinBizResourceEntryToggle bulletinBizResourceEntryToggleCopy;
        ArrayList arrayList = new ArrayList();
        List<BulletinBizResourceEntryToggle> list = ((C618380ONg) obj).LLILLL;
        if (list != null) {
            BulletinBizResourceEntryToggle bulletinBizResourceEntryToggle2 = (BulletinBizResourceEntryToggle) awS95S0201000_9.l1;
            int i = awS95S0201000_9.i2;
            Iterator<BulletinBizResourceEntryToggle> it2 = list.iterator();
            while (it2.hasNext()) {
                if (bulletinBizResourceEntryToggle2.getType() == it2.next().getType()) {
                    bulletinBizResourceEntryToggleCopy = bulletinBizResourceEntryToggle2.copy(bulletinBizResourceEntryToggle2.type, bulletinBizResourceEntryToggle2.name, i, bulletinBizResourceEntryToggle2.iconUrlModel, bulletinBizResourceEntryToggle2.extra);
                } else {
                    bulletinBizResourceEntryToggleCopy = bulletinBizResourceEntryToggle2;
                }
                arrayList.add(bulletinBizResourceEntryToggleCopy);
            }
        }
        C013C c013c = new C013C();
        BulletinBoardEditViewModel bulletinBoardEditViewModel = (BulletinBoardEditViewModel) awS95S0201000_9.l0;
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                BulletinBizResourceEntryToggle bulletinBizResourceEntryToggle3 = (BulletinBizResourceEntryToggle) obj2;
                List<BulletinBizResourceEntryToggle> list2 = bulletinBoardEditViewModel.LLJJIJI;
                if (list2 != null && (bulletinBizResourceEntryToggle = (BulletinBizResourceEntryToggle) C13LP.LJJJLZIJ(i2, list2)) != null) {
                    if (bulletinBizResourceEntryToggle.getType() != bulletinBizResourceEntryToggle3.getType() || bulletinBizResourceEntryToggle.getStatus() != bulletinBizResourceEntryToggle3.getStatus()) {
                        c013c.element = true;
                    }
                } else {
                    c013c.element = true;
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((BulletinBoardEditViewModel) awS95S0201000_9.l0).setState(new AwS375S0200000_9((List) arrayList, (List<BulletinBizResourceEntryToggle>) c013c, (C013C) 145));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0201000_9(int i, BulletinProfileViewModel bulletinProfileViewModel, BulletinFunctionSetting bulletinFunctionSetting, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = bulletinFunctionSetting;
        this.i2 = i;
        this.l1 = bulletinProfileViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0201000_9(BulletinBoardEditViewModel bulletinBoardEditViewModel, BulletinBizResourceEntryToggle bulletinBizResourceEntryToggle, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = bulletinBoardEditViewModel;
        this.l1 = bulletinBizResourceEntryToggle;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S0201000_9(MusicFavoriteButtonAssem musicFavoriteButtonAssem, int i, Fragment fragment, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = musicFavoriteButtonAssem;
        this.i2 = i;
        this.l1 = fragment;
    }
}
