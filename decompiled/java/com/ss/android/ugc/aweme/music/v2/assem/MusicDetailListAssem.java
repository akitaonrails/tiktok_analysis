package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C0AN5;
import X.C12ES;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C636000Ox4;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737030Svd;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC629450OmV;
import Y.ATListenerS343S0200000_21;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageScrollAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.ui.MDPSquareShowMoreViewHolder;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAwemeListAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import irm.AkS29S0300000_21;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailListAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public MusicDetailAwemeListFragment LLJJIII;
    public final C636000Ox4 LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicDetailListAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Ox4] */
    public MusicDetailListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1243), AFwS240S0000000_9.get$arr$(526), null, true);
        this.LLJJIJI = new InterfaceC629450OmV() { // from class: X.0Ox4
            public final Map<Integer, InterfaceC1400710mYP> LL = new LinkedHashMap();

            @Override // X.InterfaceC629450OmV
            public InterfaceC1400710mYP provider(int i) {
                InterfaceC1400710mYP c1398320mUY = (InterfaceC1400710mYP) ((LinkedHashMap) this.LL).get(Integer.valueOf(i));
                if (c1398320mUY == null) {
                    if (C636090OxD.LIZ()) {
                        switch (i) {
                            case 110005:
                                c1398320mUY = new InterfaceC1400710mYP() { // from class: X.0Ox6
                                    @Override // X.InterfaceC1400710mYP
                                    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                                        return c1398410mUh;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                        return C635990Ox3.LIZIZ(this, i2, c19eg);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                        return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                        C635990Ox3.LIZLLL(this, view, i2, smartRoute, aweme, c1398410mUh);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                                        return C635990Ox3.LJ(this, viewHolder);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                                        C635990Ox3.LJFF(this, str);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i2) {
                                        return false;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
                                        return new C636050Ox9(view);
                                    }
                                };
                                break;
                            case 110006:
                                c1398320mUY = new C1398320mUY();
                                break;
                            case 110007:
                                c1398320mUY = new C1398320mUY() { // from class: X.0mUH
                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                        return C635990Ox3.LIZIZ(this, i2, c19eg);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                        return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                                        C635990Ox3.LJFF(this, str);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1398220mUO
                                    public void onClickBottomDesc(Aweme aweme, View view) {
                                        Music music;
                                        String strCarryEffectId;
                                        String strRd0;
                                        Integer numValueOf;
                                        String strV72;
                                        String strYq0;
                                        MusicAwemeList musicAwemeListNC2;
                                        List<Aweme> list;
                                        if (aweme != null && (music = aweme.getMusic()) != null && (strCarryEffectId = music.carryEffectId()) != null) {
                                            boolean zDownloadEffectOrMusicAfterEnterCamera = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                                            String string = UUID.randomUUID().toString();
                                            String strTW0 = null;
                                            IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
                                            C1398110mUD.LIZ = "single_song";
                                            if (iMDPMobAbility != null) {
                                                strRd0 = iMDPMobAbility.rd0();
                                            } else {
                                                strRd0 = null;
                                            }
                                            C1398110mUD.LIZJ = strRd0;
                                            C1443560nfW.LIZIZ = aweme.getAid();
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            C1398330mUZ shootEvent = getShootEvent(aweme, view, string);
                                            shootEvent.LJIILIIL();
                                            linkedHashMap.put("shoot", shootEvent.LIZIZ);
                                            IMDPAwemeListAbility iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null);
                                            if (iMDPAwemeListAbility != null && (musicAwemeListNC2 = iMDPAwemeListAbility.nC2()) != null && (list = musicAwemeListNC2.squareItems) != null) {
                                                Iterator<Aweme> it2 = list.iterator();
                                                int i2 = 0;
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        if (Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                                                            break;
                                                        } else {
                                                            i2++;
                                                        }
                                                    } else {
                                                        i2 = -1;
                                                        break;
                                                    }
                                                }
                                                numValueOf = Integer.valueOf(i2 + 1);
                                            } else {
                                                numValueOf = null;
                                            }
                                            if (iMDPMobAbility != null) {
                                                strV72 = iMDPMobAbility.V72(aweme);
                                            } else {
                                                strV72 = null;
                                            }
                                            if (iMDPMobAbility != null) {
                                                strYq0 = iMDPMobAbility.yq0(aweme);
                                                strTW0 = iMDPMobAbility.TW0(view.getContext(), aweme);
                                            } else {
                                                strYq0 = null;
                                            }
                                            ShootExtraData shootExtraData = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strV72, CardStruct.IStatusCode.DEFAULT, strYq0, strTW0, linkedHashMap, null, null, null, null, 15761407, null);
                                            if (numValueOf != null) {
                                                shootExtraData.setFollowupSquareVideoRank(Integer.valueOf(numValueOf.intValue()));
                                            }
                                            C1393930mNT c1393930mNT = new C1393930mNT();
                                            c1393930mNT.LIZ = string;
                                            c1393930mNT.LIZLLL = "followup_square";
                                            c1393930mNT.LIZIZ = "followup_square";
                                            c1393930mNT.LJ = "single_song";
                                            Music music2 = aweme.getMusic();
                                            if (music2 != null) {
                                                if (C1458070o2v.LIZIZ()) {
                                                    music2.setMusicSelectedFrom("single_song");
                                                }
                                                c1393930mNT.LIZJ = music2;
                                            }
                                            c1393930mNT.LJIJJLI = shootExtraData;
                                            ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJFF(view.getContext(), C1697810uHb.LJIILJJIL(strCarryEffectId), c1393930mNT.LIZ(), zDownloadEffectOrMusicAfterEnterCamera);
                                        }
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1398220mUO
                                    public void onClickTopDesc(Aweme aweme, View view) {
                                        Music music;
                                        String strCarryEffectId;
                                        String strV72;
                                        String strYq0;
                                        List<MusicAwemeList.MDPDetailInfo> list;
                                        MusicModel musicModelConvertToMusicModel;
                                        MusicAwemeList musicAwemeListNC2;
                                        IMDPAwemeListAbility iMDPAwemeListAbility;
                                        MusicAwemeList musicAwemeListNC22;
                                        List<Aweme> list2;
                                        String strTW0;
                                        if (aweme != null && (music = aweme.getMusic()) != null && (strCarryEffectId = music.carryEffectId()) != null) {
                                            String idStr = null;
                                            IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
                                            if (iMDPMobAbility != null) {
                                                strV72 = iMDPMobAbility.V72(aweme);
                                            } else {
                                                strV72 = null;
                                            }
                                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//stickers/detail");
                                            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strCarryEffectId);
                                            smartRouteBuildRoute.withParam("transport_mdp_square_action_position", strV72);
                                            smartRouteBuildRoute.withParam("author_id", AwemeExtKt.getAuthorUid(aweme));
                                            smartRouteBuildRoute.withParam("extra_music_from", "single_song");
                                            smartRouteBuildRoute.withParam("enter_method", "click_followup_square_rec_title");
                                            smartRouteBuildRoute.withParam("aweme_id", aweme.getAid());
                                            smartRouteBuildRoute.withParam("from_mdp_square", true);
                                            smartRouteBuildRoute.withParam("extra_related_item", aweme);
                                            IMDPMobAbility iMDPMobAbility2 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
                                            String str = "";
                                            if (iMDPMobAbility2 == null || (strYq0 = iMDPMobAbility2.yq0(aweme)) == null) {
                                                strYq0 = "";
                                            }
                                            smartRouteBuildRoute.withParam("followup_square_rec_type", strYq0);
                                            IMDPMobAbility iMDPMobAbility3 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
                                            if (iMDPMobAbility3 != null && (strTW0 = iMDPMobAbility3.TW0(view.getContext(), aweme)) != null) {
                                                str = strTW0;
                                            }
                                            smartRouteBuildRoute.withParam("followup_square_rec_reason", str);
                                            if (AwemeExtKt.isMDPSquareType(aweme) && (iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null)) != null && (musicAwemeListNC22 = iMDPAwemeListAbility.nC2()) != null && (list2 = musicAwemeListNC22.squareItems) != null) {
                                                Iterator<Aweme> it2 = list2.iterator();
                                                int i2 = 0;
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        if (Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                                                            break;
                                                        } else {
                                                            i2++;
                                                        }
                                                    } else {
                                                        i2 = -1;
                                                        break;
                                                    }
                                                }
                                                smartRouteBuildRoute.withParam("followup_square_video_rank", i2 + 1);
                                            }
                                            smartRouteBuildRoute.open();
                                            IMDPAwemeListAbility iMDPAwemeListAbility2 = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null);
                                            if (iMDPAwemeListAbility2 != null && (musicAwemeListNC2 = iMDPAwemeListAbility2.nC2()) != null) {
                                                list = musicAwemeListNC2.detailInfos;
                                            } else {
                                                list = null;
                                            }
                                            Context context = view.getContext();
                                            Map<Integer, Integer> map = MusicSquareViewHolder.LLLIZZ;
                                            Context context2 = view.getContext();
                                            Music music2 = aweme.getMusic();
                                            if (music2 != null) {
                                                musicModelConvertToMusicModel = music2.convertToMusicModel();
                                            } else {
                                                musicModelConvertToMusicModel = null;
                                            }
                                            C1398280mUU.LJIILIIL(context, aweme, 110007, list, C1419640n2w.LIZ(context2, musicModelConvertToMusicModel));
                                            if (aweme.getMusic() != null) {
                                                C2344009Gk c2344009Gk = new C2344009Gk();
                                                c2344009Gk.LIZJ(0, "is_from_followup_square_original_video");
                                                c2344009Gk.LJIIIIZZ("enter_from", "single_song");
                                                c2344009Gk.LJIIIIZZ("enter_method", "click_followup_square_rec_title");
                                                c2344009Gk.LJIIIIZZ("prop_id", aweme.getMusic().carryEffectId());
                                                Music music3 = aweme.getMusic();
                                                if (music3 != null) {
                                                    idStr = music3.getIdStr();
                                                }
                                                c2344009Gk.LJIIIIZZ("music_id", idStr);
                                                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                                                if (C636090OxD.LIZ()) {
                                                    c2344009Gk.LJFF("followup_square_action_position", strV72);
                                                }
                                                C20684815ws.LJIILLIIL("enter_prop_detail", c2344009Gk.LIZ);
                                            }
                                        }
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(final View view, final String str, final InterfaceC1260110itd interfaceC1260110itd) {
                                        return new MusicSquareViewHolder(view, str, interfaceC1260110itd, this) { // from class: X.0mUN
                                            @Override // com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder
                                            public final void K6(int i2, Aweme aweme) {
                                                Music music;
                                                if (aweme != null && (music = aweme.getMusic()) != null && music.isMdpSquareCollected()) {
                                                    super.K6(i2, aweme);
                                                } else {
                                                    super.K6(i2, aweme);
                                                    ((TextView) this.itemView.findViewById(R.id.ccn)).setText(this.itemView.getContext().getString(2131848617));
                                                }
                                            }

                                            @Override // com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder
                                            public final void L6(int i2, Aweme aweme) {
                                                String strCarryEffectId;
                                                MusicAwemeList musicAwemeListNC2;
                                                List<MusicAwemeList.MDPDetailInfo> list;
                                                Music music;
                                                Music music2;
                                                if (aweme != null && (music2 = aweme.getMusic()) != null && music2.isMdpSquareCollected()) {
                                                    super.L6(i2, aweme);
                                                    return;
                                                }
                                                View viewFindViewById = this.itemView.findViewById(R.id.y_n);
                                                C786410Ut5.I7(new AkS29S0300000_21(this, aweme, viewFindViewById, 1), viewFindViewById);
                                                T6();
                                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, this.itemView.getContext());
                                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, this.itemView.getContext());
                                                View viewFindViewById2 = this.itemView.findViewById(R.id.y_o);
                                                if (numLIZJ != null && numLIZJ2 != null) {
                                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{numLIZJ.intValue(), numLIZJ2.intValue()});
                                                    gradientDrawable.setGradientType(0);
                                                    viewFindViewById2.setBackground(gradientDrawable);
                                                }
                                                C424560Gko c424560Gko = (C424560Gko) this.itemView.findViewById(R.id.fn1);
                                                TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.fo7);
                                                MusicAwemeList.MDPDetailInfo mDPDetailInfo = null;
                                                if (aweme != null && (music = aweme.getMusic()) != null) {
                                                    strCarryEffectId = music.carryEffectId();
                                                } else {
                                                    strCarryEffectId = null;
                                                }
                                                IMDPAwemeListAbility iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IMDPAwemeListAbility.class, null);
                                                if (iMDPAwemeListAbility != null && (musicAwemeListNC2 = iMDPAwemeListAbility.nC2()) != null && (list = musicAwemeListNC2.detailInfos) != null) {
                                                    Iterator<MusicAwemeList.MDPDetailInfo> it2 = list.iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        MusicAwemeList.MDPDetailInfo next = it2.next();
                                                        if (Intrinsics.LJFF(next.id, strCarryEffectId)) {
                                                            mDPDetailInfo = next;
                                                            break;
                                                        }
                                                    }
                                                    MusicAwemeList.MDPDetailInfo mDPDetailInfo2 = mDPDetailInfo;
                                                    if (mDPDetailInfo2 != null) {
                                                        c424560Gko.setPlaceholderImage(C1308910kAL.LJ(R.attr.a02, this.itemView.getContext()));
                                                        c424560Gko.setImageURI(mDPDetailInfo2.iconUrl);
                                                        c424560Gko.setCornerRadius(C418440Gaw.LIZIZ(6));
                                                        if (!C426750GoL.LIZLLL(this.itemView.getContext())) {
                                                            tuxTextView.setTextDirection(3);
                                                            tuxTextView.setLayoutDirection(0);
                                                        }
                                                        tuxTextView.setText(mDPDetailInfo2.name);
                                                    }
                                                }
                                                S6(i2, tuxTextView);
                                            }
                                        };
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                        String strYq0;
                                        super.interceptSmartRoute(view, i2, smartRoute, aweme, c1398410mUh);
                                        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
                                        if (iMDPMobAbility == null || (strYq0 = iMDPMobAbility.yq0(aweme)) == null) {
                                            strYq0 = "effect";
                                        }
                                        if (smartRoute != null) {
                                            smartRoute.withParam("followup_square_rec_type", strYq0);
                                        }
                                    }
                                };
                                break;
                            case 110008:
                                c1398320mUY = new C1398320mUY() { // from class: X.0mUI
                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                        return C635990Ox3.LIZIZ(this, i2, c19eg);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                        return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                                        C635990Ox3.LJFF(this, str);
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1398220mUO
                                    public void onClickBottomDesc(Aweme aweme, View view) {
                                        String aid;
                                        String strCarryTemplateId;
                                        String strRd0;
                                        String aid2;
                                        String strV72;
                                        String strYq0;
                                        String strTW0;
                                        String strCarryTemplateId2;
                                        Music music;
                                        MusicAwemeList musicAwemeListNC2;
                                        List<Aweme> list;
                                        String aid3;
                                        Music music2;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("MDPTemplateSquareListProvider onClickBottomDesc-->aid:");
                                        String aid4 = null;
                                        if (aweme != null) {
                                            aid = aweme.getAid();
                                        } else {
                                            aid = null;
                                        }
                                        sbLIZ.append(aid);
                                        sbLIZ.append(" template_id:");
                                        if (aweme != null && (music2 = aweme.getMusic()) != null) {
                                            strCarryTemplateId = music2.carryTemplateId();
                                        } else {
                                            strCarryTemplateId = null;
                                        }
                                        sbLIZ.append(strCarryTemplateId);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
                                        C1398110mUD.LIZ = "single_song";
                                        if (iMDPMobAbility != null) {
                                            strRd0 = iMDPMobAbility.rd0();
                                        } else {
                                            strRd0 = null;
                                        }
                                        C1398110mUD.LIZJ = strRd0;
                                        if (aweme != null) {
                                            aid2 = aweme.getAid();
                                        } else {
                                            aid2 = null;
                                        }
                                        C1443560nfW.LIZIZ = aid2;
                                        C1398330mUZ shootEvent = getShootEvent(aweme, view, "");
                                        shootEvent.LJIILIIL();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("shoot", shootEvent.LIZIZ);
                                        ShootExtraData shootExtraData = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
                                        shootExtraData.setMobParams(linkedHashMap);
                                        if (iMDPMobAbility != null) {
                                            strV72 = iMDPMobAbility.V72(aweme);
                                        } else {
                                            strV72 = null;
                                        }
                                        shootExtraData.setFollowupSquareActionPosition(strV72);
                                        shootExtraData.setFromFollowupSquareOriginalVideo(CardStruct.IStatusCode.DEFAULT);
                                        if (iMDPMobAbility != null) {
                                            strYq0 = iMDPMobAbility.yq0(aweme);
                                        } else {
                                            strYq0 = null;
                                        }
                                        shootExtraData.setFollowupSquareRecommendType(strYq0);
                                        if (iMDPMobAbility != null) {
                                            strTW0 = iMDPMobAbility.TW0(view.getContext(), aweme);
                                        } else {
                                            strTW0 = null;
                                        }
                                        shootExtraData.setFollowupSquareRecommendReason(strTW0);
                                        IMDPAwemeListAbility iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null);
                                        if (iMDPAwemeListAbility != null && (musicAwemeListNC2 = iMDPAwemeListAbility.nC2()) != null && (list = musicAwemeListNC2.squareItems) != null) {
                                            Iterator<Aweme> it2 = list.iterator();
                                            int i2 = 0;
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    String aid5 = it2.next().getAid();
                                                    if (aweme != null) {
                                                        aid3 = aweme.getAid();
                                                    } else {
                                                        aid3 = null;
                                                    }
                                                    if (Intrinsics.LJFF(aid5, aid3)) {
                                                        break;
                                                    } else {
                                                        i2++;
                                                    }
                                                } else {
                                                    i2 = -1;
                                                    break;
                                                }
                                            }
                                            Integer numValueOf = Integer.valueOf(i2 + 1);
                                            if (numValueOf != null) {
                                                shootExtraData.setFollowupSquareVideoRank(Integer.valueOf(numValueOf.intValue()));
                                            }
                                        }
                                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//startUseTemplate");
                                        if (aweme != null && (music = aweme.getMusic()) != null) {
                                            strCarryTemplateId2 = music.carryTemplateId();
                                        } else {
                                            strCarryTemplateId2 = null;
                                        }
                                        smartRouteBuildRoute.withParam("template_id", strCarryTemplateId2);
                                        smartRouteBuildRoute.withParam("shoot_way", "followup_square");
                                        smartRouteBuildRoute.withParam("schema_tag", "template_schema");
                                        if (aweme != null) {
                                            aid4 = aweme.getAid();
                                        }
                                        smartRouteBuildRoute.withParam("group_id", aid4);
                                        smartRouteBuildRoute.withParam("enter_from", "single_song");
                                        smartRouteBuildRoute.withParam("shoot_extra_data", (Serializable) shootExtraData);
                                        smartRouteBuildRoute.open();
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1398220mUO
                                    public void onClickTopDesc(Aweme aweme, View view) {
                                        List<MusicAwemeList.MDPDetailInfo> list;
                                        MusicAwemeList musicAwemeListNC2;
                                        if (aweme == null) {
                                            return;
                                        }
                                        MusicModel musicModelConvertToMusicModel = null;
                                        IMDPAwemeListAbility iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null);
                                        if (iMDPAwemeListAbility != null && (musicAwemeListNC2 = iMDPAwemeListAbility.nC2()) != null) {
                                            list = musicAwemeListNC2.detailInfos;
                                        } else {
                                            list = null;
                                        }
                                        Context context = view.getContext();
                                        Map<Integer, Integer> map = MusicSquareViewHolder.LLLIZZ;
                                        Context context2 = view.getContext();
                                        Music music = aweme.getMusic();
                                        if (music != null) {
                                            musicModelConvertToMusicModel = music.convertToMusicModel();
                                        }
                                        C1398280mUU.LJIILIIL(context, aweme, 110008, list, C1419640n2w.LIZ(context2, musicModelConvertToMusicModel));
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(final View view, final String str, final InterfaceC1260110itd interfaceC1260110itd) {
                                        return new MusicSquareViewHolder(view, str, interfaceC1260110itd, this) { // from class: X.0mUM
                                            @Override // com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder
                                            public final void K6(int i2, Aweme aweme) {
                                                Music music;
                                                if (aweme != null && (music = aweme.getMusic()) != null && music.isMdpSquareCollected()) {
                                                    super.K6(i2, aweme);
                                                } else {
                                                    super.K6(i2, aweme);
                                                    ((TextView) this.itemView.findViewById(R.id.ccn)).setText(this.itemView.getContext().getString(2131848619));
                                                }
                                            }

                                            @Override // com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder
                                            public final void L6(int i2, Aweme aweme) {
                                                String strCarryTemplateId;
                                                MusicAwemeList musicAwemeListNC2;
                                                List<MusicAwemeList.MDPDetailInfo> list;
                                                Music music;
                                                Music music2;
                                                if (aweme != null && (music2 = aweme.getMusic()) != null && music2.isMdpSquareCollected()) {
                                                    super.L6(i2, aweme);
                                                    return;
                                                }
                                                T6();
                                                View viewFindViewById = this.itemView.findViewById(R.id.y_n);
                                                viewFindViewById.setOnTouchListener(new ATListenerS343S0200000_21(this, viewFindViewById, 2));
                                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, this.itemView.getContext());
                                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, this.itemView.getContext());
                                                View viewFindViewById2 = this.itemView.findViewById(R.id.y_o);
                                                if (numLIZJ != null && numLIZJ2 != null) {
                                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{numLIZJ.intValue(), numLIZJ2.intValue()});
                                                    gradientDrawable.setGradientType(0);
                                                    viewFindViewById2.setBackground(gradientDrawable);
                                                }
                                                C424560Gko c424560Gko = (C424560Gko) this.itemView.findViewById(R.id.fn1);
                                                TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.fo7);
                                                MusicAwemeList.MDPDetailInfo mDPDetailInfo = null;
                                                if (aweme != null && (music = aweme.getMusic()) != null) {
                                                    strCarryTemplateId = music.carryTemplateId();
                                                } else {
                                                    strCarryTemplateId = null;
                                                }
                                                IMDPAwemeListAbility iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IMDPAwemeListAbility.class, null);
                                                if (iMDPAwemeListAbility != null && (musicAwemeListNC2 = iMDPAwemeListAbility.nC2()) != null && (list = musicAwemeListNC2.detailInfos) != null) {
                                                    Iterator<MusicAwemeList.MDPDetailInfo> it2 = list.iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        MusicAwemeList.MDPDetailInfo next = it2.next();
                                                        if (Intrinsics.LJFF(next.id, strCarryTemplateId)) {
                                                            mDPDetailInfo = next;
                                                            break;
                                                        }
                                                    }
                                                    MusicAwemeList.MDPDetailInfo mDPDetailInfo2 = mDPDetailInfo;
                                                    if (mDPDetailInfo2 != null) {
                                                        c424560Gko.setPlaceholderImage(C1308910kAL.LJ(R.attr.a02, this.itemView.getContext()));
                                                        if (C123100dR.LIZ(mDPDetailInfo2.iconUrl)) {
                                                            c424560Gko.setImageURI(mDPDetailInfo2.iconUrl);
                                                            c424560Gko.setCornerRadius(C418440Gaw.LIZIZ(6));
                                                        }
                                                        if (C123100dR.LIZ(mDPDetailInfo2.name)) {
                                                            if (!C426750GoL.LIZLLL(this.itemView.getContext())) {
                                                                tuxTextView.setTextDirection(3);
                                                                tuxTextView.setLayoutDirection(0);
                                                            }
                                                            tuxTextView.setText(mDPDetailInfo2.name);
                                                        }
                                                    }
                                                }
                                                S6(i2, tuxTextView);
                                            }
                                        };
                                    }

                                    @Override // X.C1398320mUY, X.InterfaceC1400710mYP
                                    public void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                        String strYq0;
                                        super.interceptSmartRoute(view, i2, smartRoute, aweme, c1398410mUh);
                                        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
                                        if (iMDPMobAbility == null || (strYq0 = iMDPMobAbility.yq0(aweme)) == null) {
                                            strYq0 = "template";
                                        }
                                        if (smartRoute != null) {
                                            smartRoute.withParam("followup_square_rec_type", strYq0);
                                        }
                                    }
                                };
                                break;
                            case 110009:
                                c1398320mUY = new InterfaceC1400710mYP() { // from class: X.0Ox2
                                    @Override // X.InterfaceC1400710mYP
                                    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                                        return c1398410mUh;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                        return C635990Ox3.LIZIZ(this, i2, c19eg);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                        return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                        C635990Ox3.LIZLLL(this, view, i2, smartRoute, aweme, c1398410mUh);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                                        return C635990Ox3.LJ(this, viewHolder);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                                        C635990Ox3.LJFF(this, str);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i2) {
                                        return false;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
                                        return new MDPSquareShowMoreViewHolder(view);
                                    }
                                };
                                break;
                            case 110010:
                                c1398320mUY = new InterfaceC1400710mYP() { // from class: X.0Ox7
                                    @Override // X.InterfaceC1400710mYP
                                    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                                        return c1398410mUh;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                        return C635990Ox3.LIZIZ(this, i2, c19eg);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                        return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                        C635990Ox3.LIZLLL(this, view, i2, smartRoute, aweme, c1398410mUh);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                                        return C635990Ox3.LJ(this, viewHolder);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                                        C635990Ox3.LJFF(this, str);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i2) {
                                        return false;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(final View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
                                        return new AbstractC1261240ivS(view) { // from class: X.0Ox8
                                            public final /* synthetic */ View LLIZ;

                                            @Override // X.InterfaceC1259900itI
                                            public final void M0() {
                                            }

                                            @Override // X.AbstractC1261240ivS
                                            public final void a6() {
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(view);
                                                this.LLIZ = view;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r6
                                              0x0037: PHI (r6v5 java.lang.String) = (r6v0 java.lang.String), (r6v6 java.lang.String) binds: [B:7:0x002f, B:9:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[PHI: r6 r8
                                              0x003a: PHI (r6v1 java.lang.String) = (r6v5 java.lang.String), (r6v6 java.lang.String) binds: [B:11:0x0038, B:9:0x0035] A[DONT_GENERATE, DONT_INLINE]
                                              0x003a: PHI (r8v0 java.lang.String) = (r8v4 java.lang.String), (r8v5 java.lang.String) binds: [B:11:0x0038, B:9:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[PHI: r6 r8
                                              0x0056: PHI (r6v4 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:13:0x003e, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
                                              0x0056: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:13:0x003e, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[PHI: r6
                                              0x0031: PHI (r6v6 java.lang.String) = (r6v0 java.lang.String), (r6v7 java.lang.String) binds: [B:7:0x002f, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
                                            @Override // X.AbstractC1261240ivS
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final void X5(com.ss.android.ugc.aweme.feed.model.Aweme r10, int r11, boolean r12, android.os.Bundle r13) {
                                                /*
                                                    r9 = this;
                                                    android.view.View r1 = r9.LLIZ
                                                    r0 = 2131375011(0x7f0a33a3, float:1.8370158E38)
                                                    android.view.View r3 = r1.findViewById(r0)
                                                    com.bytedance.tux.input.TuxTextView r3 = (com.bytedance.tux.input.TuxTextView) r3
                                                    android.view.View r0 = r9.LLIZ
                                                    r2 = 0
                                                    X.0Q7z r1 = X.C1558360qeg.LJ(r0, r2)
                                                    java.lang.Class<com.ss.android.ugc.aweme.music.ui.IMDPMobAbility> r0 = com.ss.android.ugc.aweme.music.ui.IMDPMobAbility.class
                                                    X.01wD r5 = X.C1558520qew.LIZ(r1, r0, r2)
                                                    com.ss.android.ugc.aweme.music.ui.IMDPMobAbility r5 = (com.ss.android.ugc.aweme.music.ui.IMDPMobAbility) r5
                                                    android.view.View r0 = r9.LLIZ
                                                    android.content.Context r0 = r0.getContext()
                                                    int r4 = X.C12ES.LJIIIIZZ(r0)
                                                    java.lang.String r7 = ""
                                                    if (r5 == 0) goto L2e
                                                    java.lang.String r6 = r5.KZ1()
                                                    if (r6 != 0) goto L31
                                                L2e:
                                                    r6 = r7
                                                    if (r5 == 0) goto L37
                                                L31:
                                                    java.lang.String r8 = r5.LLIIJI()
                                                    if (r8 != 0) goto L3a
                                                L37:
                                                    r8 = r7
                                                    if (r5 == 0) goto L56
                                                L3a:
                                                    java.lang.String r0 = r5.LJJLIIIJJI()
                                                    if (r0 == 0) goto L56
                                                    r7 = r0
                                                L41:
                                                    java.lang.String r0 = "trending_create_with_show"
                                                    boolean r0 = r5.G92(r0)
                                                    if (r0 != 0) goto L55
                                                L49:
                                                    android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
                                                    X.0OxA r2 = new X.0OxA
                                                    r2.<init>()
                                                    X.C786410Ut5.x3(r0, r2)
                                                L55:
                                                    return
                                                L56:
                                                    if (r5 == 0) goto L49
                                                    goto L41
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C636040Ox8.X5(com.ss.android.ugc.aweme.feed.model.Aweme, int, boolean, android.os.Bundle):void");
                                            }
                                        };
                                    }
                                };
                                break;
                            case 110011:
                                c1398320mUY = new InterfaceC1400710mYP() { // from class: X.0Ox5
                                    @Override // X.InterfaceC1400710mYP
                                    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                                        return c1398410mUh;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                        return C635990Ox3.LIZIZ(this, i2, c19eg);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                        return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                        C635990Ox3.LIZLLL(this, view, i2, smartRoute, aweme, c1398410mUh);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                                        return C635990Ox3.LJ(this, viewHolder);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
                                        C635990Ox3.LJFF(this, str);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i2) {
                                        return false;
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(final View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
                                        return new AbstractC1261240ivS(view) { // from class: X.0OxC
                                            public final /* synthetic */ View LLIZ;

                                            @Override // X.InterfaceC1259900itI
                                            public final void M0() {
                                            }

                                            @Override // X.AbstractC1261240ivS
                                            public final void a6() {
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(view);
                                                this.LLIZ = view;
                                            }

                                            @Override // X.AbstractC1261240ivS
                                            public final void X5(Aweme aweme, int i2, boolean z, Bundle bundle) {
                                                ((C1390410mHn) this.LLIZ.findViewById(R.id.nle)).LIZJ();
                                            }
                                        };
                                    }
                                };
                                break;
                            default:
                                c1398320mUY = new InterfaceC1400710mYP() { // from class: X.0mUX
                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                        return C635990Ox3.LIZIZ(this, i2, c19eg);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                        return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                                        return C635990Ox3.LJ(this, viewHolder);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public void onJumpToDetail(String str) {
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public boolean sendCustomRequest(C1255920ims<?> c1255920ims, int i2) {
                                        return false;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
                                    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
                                    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
                                    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
                                    /* JADX WARN: Removed duplicated region for block: B:6:0x005b  */
                                    @Override // X.InterfaceC1400710mYP
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public X.C1398410mUh getJumpToVideoParam(X.C1398410mUh r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
                                        /*
                                            Method dump skipped, instruction units count: 248
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C1398310mUX.getJumpToVideoParam(X.0mUh, com.ss.android.ugc.aweme.feed.model.Aweme):X.0mUh");
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public C1398630mV3 onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
                                        return new C1398620mV2(view, str, interfaceC1260110itd);
                                    }

                                    @Override // X.InterfaceC1400710mYP
                                    public void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                        MusicAwemeList musicAwemeListNC2;
                                        int iNH1;
                                        String strYq0;
                                        IMDPMobAbility iMDPMobAbility;
                                        String strTW0;
                                        IMDPMobAbility iMDPMobAbility2;
                                        IMDPMobAbility iMDPMobAbility3;
                                        IMDPAwemeListAbility iMDPAwemeListAbility;
                                        if (view != null && (iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null)) != null) {
                                            musicAwemeListNC2 = iMDPAwemeListAbility.nC2();
                                        } else {
                                            musicAwemeListNC2 = null;
                                        }
                                        if (smartRoute != null) {
                                            smartRoute.withParam("enter_from", "single_song");
                                        }
                                        if (C636090OxD.LIZ()) {
                                            if (musicAwemeListNC2 != null && musicAwemeListNC2.containSquareData && smartRoute != null) {
                                                smartRoute.withParam("from_mdp_square", true);
                                            }
                                            if (view != null && (iMDPMobAbility3 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null)) != null) {
                                                iNH1 = iMDPMobAbility3.nH1();
                                            } else {
                                                iNH1 = -1;
                                            }
                                            if (iNH1 == 0) {
                                                if (smartRoute != null) {
                                                    smartRoute.withParam("transport_mdp_square_action_position", 2);
                                                }
                                            } else if (iNH1 == 1) {
                                                if (smartRoute != null) {
                                                    smartRoute.withParam("transport_mdp_square_action_position", 3);
                                                }
                                            } else if (iNH1 != -1 && smartRoute != null) {
                                                smartRoute.withParam("transport_mdp_square_action_position", iNH1);
                                            }
                                            String str = "";
                                            if (view == null || (iMDPMobAbility2 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null)) == null || (strYq0 = iMDPMobAbility2.yq0(aweme)) == null) {
                                                strYq0 = "";
                                            }
                                            if (smartRoute != null) {
                                                smartRoute.withParam("followup_square_rec_type", strYq0);
                                            }
                                            if (view != null && (iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null)) != null && (strTW0 = iMDPMobAbility.TW0(view.getContext(), aweme)) != null) {
                                                str = strTW0;
                                            }
                                            if (smartRoute != null) {
                                                smartRoute.withParam("followup_square_rec_reason", str);
                                            }
                                            if (iNH1 != -1 && smartRoute != null) {
                                                smartRoute.withParam("shoot_way", "followup_square");
                                                smartRoute.withParam("music_selected_from", "followup_square");
                                            }
                                        } else if (musicAwemeListNC2 != null && musicAwemeListNC2.wouldContainSquareData && smartRoute != null) {
                                            smartRoute.withParam("from_mdp_would_square", true);
                                        }
                                        C635990Ox3.LIZLLL(this, view, i2, smartRoute, aweme, c1398410mUh);
                                    }
                                };
                                break;
                        }
                    } else {
                        c1398320mUY = new InterfaceC1400710mYP() { // from class: X.0mUX
                            @Override // X.InterfaceC1400710mYP
                            public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i2) {
                                return C635990Ox3.LIZ(this, c1398410mUh, aweme, i2);
                            }

                            @Override // X.InterfaceC1400710mYP
                            public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg) {
                                return C635990Ox3.LIZIZ(this, i2, c19eg);
                            }

                            @Override // X.InterfaceC1400710mYP
                            public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i2, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                                return C635990Ox3.LIZJ(this, i2, c19eg, interfaceC214902198i);
                            }

                            @Override // X.InterfaceC1400710mYP
                            public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                                return C635990Ox3.LJ(this, viewHolder);
                            }

                            @Override // X.InterfaceC1400710mYP
                            public void onJumpToDetail(String str) {
                            }

                            @Override // X.InterfaceC1400710mYP
                            public boolean sendCustomRequest(C1255920ims<?> c1255920ims, int i2) {
                                return false;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
                            /* JADX WARN: Removed duplicated region for block: B:6:0x005b  */
                            @Override // X.InterfaceC1400710mYP
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public X.C1398410mUh getJumpToVideoParam(X.C1398410mUh r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
                                /*
                                    Method dump skipped, instruction units count: 248
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1398310mUX.getJumpToVideoParam(X.0mUh, com.ss.android.ugc.aweme.feed.model.Aweme):X.0mUh");
                            }

                            @Override // X.InterfaceC1400710mYP
                            public C1398630mV3 onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
                                return new C1398620mV2(view, str, interfaceC1260110itd);
                            }

                            @Override // X.InterfaceC1400710mYP
                            public void interceptSmartRoute(View view, int i2, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                                MusicAwemeList musicAwemeListNC2;
                                int iNH1;
                                String strYq0;
                                IMDPMobAbility iMDPMobAbility;
                                String strTW0;
                                IMDPMobAbility iMDPMobAbility2;
                                IMDPMobAbility iMDPMobAbility3;
                                IMDPAwemeListAbility iMDPAwemeListAbility;
                                if (view != null && (iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null)) != null) {
                                    musicAwemeListNC2 = iMDPAwemeListAbility.nC2();
                                } else {
                                    musicAwemeListNC2 = null;
                                }
                                if (smartRoute != null) {
                                    smartRoute.withParam("enter_from", "single_song");
                                }
                                if (C636090OxD.LIZ()) {
                                    if (musicAwemeListNC2 != null && musicAwemeListNC2.containSquareData && smartRoute != null) {
                                        smartRoute.withParam("from_mdp_square", true);
                                    }
                                    if (view != null && (iMDPMobAbility3 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null)) != null) {
                                        iNH1 = iMDPMobAbility3.nH1();
                                    } else {
                                        iNH1 = -1;
                                    }
                                    if (iNH1 == 0) {
                                        if (smartRoute != null) {
                                            smartRoute.withParam("transport_mdp_square_action_position", 2);
                                        }
                                    } else if (iNH1 == 1) {
                                        if (smartRoute != null) {
                                            smartRoute.withParam("transport_mdp_square_action_position", 3);
                                        }
                                    } else if (iNH1 != -1 && smartRoute != null) {
                                        smartRoute.withParam("transport_mdp_square_action_position", iNH1);
                                    }
                                    String str = "";
                                    if (view == null || (iMDPMobAbility2 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null)) == null || (strYq0 = iMDPMobAbility2.yq0(aweme)) == null) {
                                        strYq0 = "";
                                    }
                                    if (smartRoute != null) {
                                        smartRoute.withParam("followup_square_rec_type", strYq0);
                                    }
                                    if (view != null && (iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null)) != null && (strTW0 = iMDPMobAbility.TW0(view.getContext(), aweme)) != null) {
                                        str = strTW0;
                                    }
                                    if (smartRoute != null) {
                                        smartRoute.withParam("followup_square_rec_reason", str);
                                    }
                                    if (iNH1 != -1 && smartRoute != null) {
                                        smartRoute.withParam("shoot_way", "followup_square");
                                        smartRoute.withParam("music_selected_from", "followup_square");
                                    }
                                } else if (musicAwemeListNC2 != null && musicAwemeListNC2.wouldContainSquareData && smartRoute != null) {
                                    smartRoute.withParam("from_mdp_would_square", true);
                                }
                                C635990Ox3.LIZLLL(this, view, i2, smartRoute, aweme, c1398410mUh);
                            }
                        };
                    }
                    this.LL.put(Integer.valueOf(i), c1398320mUY);
                }
                return c1398320mUY;
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
    }

    public final MusicDetailViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Bundle arguments;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null) {
            arguments.getString("shoot_enter_from");
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.ms4);
        Zo(frameLayout);
        super.xo();
    }

    @C14EU
    public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        PageScrollAbility pageScrollAbility;
        int iIndexOf;
        View viewFindViewByPosition;
        Object obj;
        UserStory userStory;
        List<Aweme> stories;
        PageScrollAbility pageScrollAbility2;
        Object obj2 = c737030Svd.LIZIZ;
        if ((obj2 instanceof Aweme) && (aweme = (Aweme) obj2) != null && c737030Svd.LIZ == 21 && Intrinsics.LJFF(lp().LLILLL, aweme.getMusic().getMid())) {
            if (lp().LLJJJJ && !lp().LLJJJJJIL) {
                return;
            }
            if (!((Boolean) C0AN5.LIZ.getValue()).booleanValue()) {
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (pageScrollAbility2 = (PageScrollAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PageScrollAbility.class, null)) != null) {
                    pageScrollAbility2.QW0(5000);
                    return;
                }
                return;
            }
            MusicDetailAwemeListFragment musicDetailAwemeListFragment = this.LLJJIII;
            if (musicDetailAwemeListFragment == null) {
                return;
            }
            if (musicDetailAwemeListFragment.LLJJJJ != null) {
                if (aweme.getIsTikTokStory()) {
                    int size = musicDetailAwemeListFragment.LLJJJJ.mmItems.size();
                    iIndexOf = 0;
                    while (true) {
                        if (iIndexOf < size) {
                            Aweme aweme2 = (Aweme) ListProtector.get(musicDetailAwemeListFragment.LLJJJJ.mmItems, iIndexOf);
                            if (aweme2 != null && (userStory = aweme2.getUserStory()) != null && (stories = userStory.getStories()) != null) {
                                obj = ListProtector.get(stories, 0);
                            } else {
                                obj = null;
                            }
                            if (Intrinsics.LJFF(obj, aweme)) {
                                break;
                            } else {
                                iIndexOf++;
                            }
                        } else {
                            iIndexOf = -1;
                            break;
                        }
                    }
                } else {
                    iIndexOf = musicDetailAwemeListFragment.LLJJJJ.mmItems.indexOf(aweme);
                }
                RecyclerView.LayoutManager layoutManager = musicDetailAwemeListFragment.LLJJIJIIJIL.getLayoutManager();
                if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(iIndexOf)) != null) {
                    int[] iArr = new int[2];
                    viewFindViewByPosition.getLocationOnScreen(iArr);
                    C844470XAv.LIZ.getClass();
                    int iLJIIIIZZ = C12ES.LJIIIIZZ(C844470XAv.LIZ()) - iArr[1];
                    if (viewFindViewByPosition.getHeight() > 0 && (iLJIIIIZZ * 1.0f) / viewFindViewByPosition.getHeight() > 0.4f) {
                        return;
                    }
                }
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 == null || (pageScrollAbility = (PageScrollAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), PageScrollAbility.class, null)) == null) {
                return;
            }
            pageScrollAbility.QW0(5000);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        AssemViewModel.asyncSubscribe$default(lp(), new C2217381BqS() { // from class: X.0Ojd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS218S0300000_9(this, view, context, 8), 14, null);
    }
}
