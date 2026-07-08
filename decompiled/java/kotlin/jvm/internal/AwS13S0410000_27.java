package kotlin.jvm.internal;

import X.AbstractC1700910uMb;
import X.C09AY;
import X.C0IJT;
import X.C0KPJ;
import X.C0UC1;
import X.C13LP;
import X.C15438062q;
import X.C1814520xJq;
import X.C1853060yK0;
import X.C19EG;
import X.C19EH;
import X.C20230914Dz;
import X.C20337914i1;
import X.C2097908Jt;
import X.C474500IjA;
import X.C500260Jjc;
import X.C5182020e;
import X.C752520TfW;
import X.C768300UBw;
import X.C784830UqX;
import X.C786410Ut5;
import Y.AComparatorS27S0000000_8;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookBoardEntityStatusChannel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.LastUsedLiveBoardsModel;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.android.livesdk.model.SourcePB;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS13S0410000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.ss.android.ugc.aweme.mediachoose.helper.MediaModel] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    public static final Object invoke$0(AwS13S0410000_27 awS13S0410000_27, Object obj) {
        C1853060yK0 c1853060yK0 = (C1853060yK0) obj;
        TikTokMediaModel media = c1853060yK0.LL.getMedia();
        int i = -1;
        int iIntValue = 0;
        if (media != null) {
            if (!Intrinsics.LJFF(((MediaModel) media).id, ((MediaModel) ((TikTokMediaModel) awS13S0410000_27.l0)).id)) {
                List<TikTokMediaModel> list = c1853060yK0.LLILZIL.LIZ;
                TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) awS13S0410000_27.l0;
                Iterator<TikTokMediaModel> it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((MediaModel) it2.next()).id, ((MediaModel) tikTokMediaModel).id)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                List<TikTokMediaModel> list2 = c1853060yK0.LLILLJJLI;
                TikTokMediaModel tikTokMediaModel2 = (TikTokMediaModel) awS13S0410000_27.l0;
                Iterator<TikTokMediaModel> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((MediaModel) it3.next()).id, ((MediaModel) tikTokMediaModel2).id)) {
                        i = iIntValue;
                        break;
                    }
                    iIntValue++;
                }
                TikTokMediaModel tikTokMediaModel3 = (TikTokMediaModel) C13LP.LJJJLZIJ(i, c1853060yK0.LLILLJJLI);
                if (tikTokMediaModel3 != null) {
                    ((TakoPhotoChooseViewModel) awS13S0410000_27.l1).setState(new AwS35S0102000_27(i2, tikTokMediaModel3, i, 0));
                }
            }
        } else {
            List<TikTokMediaModel> list3 = c1853060yK0.LLILZIL.LIZ;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list3, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (TikTokMediaModel tikTokMediaModel4 : list3) {
                linkedHashMap.put(((MediaModel) tikTokMediaModel4).id, tikTokMediaModel4);
            }
            ArrayList arrayList = new ArrayList(c1853060yK0.LLIZ);
            ArrayList arrayList2 = new ArrayList(c1853060yK0.LLILZIL.LIZ);
            if (awS13S0410000_27.z4 && (!arrayList.isEmpty())) {
                List<??> listLJLLLL = C13LP.LJLLLL(new AComparatorS27S0000000_8(9), arrayList);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                for (?? r1 : listLJLLLL) {
                    Object obj2 = linkedHashMap.get(r1.id);
                    if (obj2 != null) {
                        r1 = obj2;
                    }
                    arrayList3.add(r1);
                }
                arrayList2 = new ArrayList(arrayList3);
            }
            ((TakoPhotoChooseViewModel) awS13S0410000_27.l1).setState(new AwS39S0010000_27(awS13S0410000_27.z4, 13));
            TikTokMediaModel tikTokMediaModel5 = (TikTokMediaModel) linkedHashMap.get(((MediaModel) ((TikTokMediaModel) awS13S0410000_27.l0)).id);
            if (tikTokMediaModel5 == null) {
                tikTokMediaModel5 = (TikTokMediaModel) awS13S0410000_27.l0;
            }
            TikTokMediaModel tikTokMediaModel6 = (TikTokMediaModel) awS13S0410000_27.l0;
            Iterator it4 = arrayList2.iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((MediaModel) it4.next()).id, ((MediaModel) tikTokMediaModel6).id)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0) {
                iIntValue = numValueOf.intValue();
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(tikTokMediaModel5);
            }
            ((TakoPhotoChooseViewModel) awS13S0410000_27.l1).setState(new AwS108S0201000_27(tikTokMediaModel5, (TikTokMediaModel) iIntValue, (int) arrayList2, (ArrayList<TikTokMediaModel>) 1));
            FragmentManager fragmentManagerLIZIZ = C20230914Dz.LIZIZ((Fragment) awS13S0410000_27.l2, (C19EG) awS13S0410000_27.l3);
            if (fragmentManagerLIZIZ != null) {
                PreviewPhotoFragment.LLJJIJI.getClass();
                try {
                    PreviewPhotoFragment previewPhotoFragment = new PreviewPhotoFragment();
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJIL(bundle, "media_model_list", arrayList2);
                    bundle.putInt("initial_position", iIntValue);
                    bundle.putBoolean("with_animation", true);
                    previewPhotoFragment.setArguments(bundle);
                    C19EH c19ehLJIIJ = fragmentManagerLIZIZ.LJIIJ();
                    c19ehLJIIJ.LIZIZ(R.id.rpx, previewPhotoFragment);
                    c19ehLJIIJ.LJII("PreviewPhotoFragment");
                    c19ehLJIIJ.LJIIIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S0410000_27 awS13S0410000_27, Object obj) {
        boolean z;
        HashMap map;
        BoardItem next;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String str;
        String str2;
        String str3;
        Object objValueOf;
        SceneryContent sceneryContent;
        Integer numValueOf;
        SourcePB sourcePB;
        SourcePB sourcePB2;
        SourcePB sourcePB3;
        SourcePB sourcePB4;
        SourcePB sourcePB5;
        SourcePB sourcePB6;
        SourcePB sourcePB7;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C1814520xJq c1814520xJq = C1814520xJq.LIZ;
            Board board = (Board) awS13S0410000_27.l0;
            C20337914i1<LastUsedLiveBoardsModel> c20337914i1 = C0KPJ.pf;
            LastUsedLiveBoardsModel lastUsedLiveBoardsModelLIZIZ = c20337914i1.LIZIZ();
            lastUsedLiveBoardsModelLIZIZ.getClass();
            if (board.boardItemList.isEmpty()) {
                lastUsedLiveBoardsModelLIZIZ.needRestore = false;
            } else {
                lastUsedLiveBoardsModelLIZIZ.boardId = board.id;
                lastUsedLiveBoardsModelLIZIZ.updateTime = System.currentTimeMillis();
                lastUsedLiveBoardsModelLIZIZ.needRestore = true;
            }
            c20337914i1.LIZJ();
            if (C500260Jjc.LJJ()) {
                Board board2 = (Board) awS13S0410000_27.l0;
                C0UC1 c0uc1 = C784830UqX.LIZ;
                if (c0uc1 != null && board2.id == c0uc1.LJ) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && C784830UqX.LIZIZ != null) {
                    if (c0uc1 == null) {
                        C784830UqX.LIZ = C784830UqX.LIZ(board2);
                        c0uc1 = null;
                    } else {
                        C784830UqX.LIZ = C784830UqX.LIZ(board2);
                    }
                    C768300UBw.LJIIL(C784830UqX.LIZ, c0uc1);
                }
                HashMap map2 = (HashMap) awS13S0410000_27.l1;
                if (map2 != null && map2.containsKey("entry_source")) {
                    map = (HashMap) awS13S0410000_27.l1;
                } else {
                    map = new HashMap();
                    if (C500260Jjc.LJJ()) {
                        map.put("entry_source", "pre_live_board");
                    }
                }
                Board board3 = (Board) awS13S0410000_27.l0;
                boolean z2 = awS13S0410000_27.z4;
                List<BoardItem> list = board3.boardItemList;
                ArrayList arrayList = new ArrayList();
                for (BoardItem boardItem : list) {
                    int i = boardItem.boardItemType;
                    if (i == 4 || i == 7) {
                        arrayList.add(boardItem);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((BoardItem) it2.next()).id));
                }
                List<BoardItem> list2 = board3.boardItemList;
                ArrayList arrayList3 = new ArrayList();
                for (BoardItem boardItem2 : list2) {
                    if (boardItem2.boardItemType == 5) {
                        arrayList3.add(boardItem2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Long.valueOf(((BoardItem) it3.next()).id));
                }
                Iterator<BoardItem> it4 = board3.boardItemList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (next.boardItemType == 6) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                BoardItem boardItem3 = next;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_set_apply_successfully");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII(Integer.valueOf(board3.boardItemList.size()), "used_slot_cnt");
                RecommendBoardInfo recommendBoardInfo = board3.recommendBoardInfo;
                String str4 = CardStruct.IStatusCode.DEFAULT;
                if (recommendBoardInfo == null || (string = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(string, "board_source");
                RecommendBoardInfo recommendBoardInfo2 = board3.recommendBoardInfo;
                String str5 = "";
                if (recommendBoardInfo2 == null || (sourcePB7 = recommendBoardInfo2.sourcePb) == null || (string2 = Long.valueOf(sourcePB7.strategyBoardValue).toString()) == null) {
                    string2 = "";
                }
                c474500IjALIZ.LJJII(string2, "strategy_board_value");
                RecommendBoardInfo recommendBoardInfo3 = board3.recommendBoardInfo;
                if (recommendBoardInfo3 == null || (sourcePB6 = recommendBoardInfo3.sourcePb) == null || (string3 = Long.valueOf(sourcePB6.strategyLiveType).toString()) == null) {
                    string3 = "";
                }
                c474500IjALIZ.LJJII(string3, "strategy_live_type");
                RecommendBoardInfo recommendBoardInfo4 = board3.recommendBoardInfo;
                if (recommendBoardInfo4 == null || (sourcePB5 = recommendBoardInfo4.sourcePb) == null || (string4 = Long.valueOf(sourcePB5.strategyBoardContentType).toString()) == null) {
                    string4 = "";
                }
                c474500IjALIZ.LJJII(string4, "strategy_board_content");
                RecommendBoardInfo recommendBoardInfo5 = board3.recommendBoardInfo;
                if (recommendBoardInfo5 == null || (sourcePB4 = recommendBoardInfo5.sourcePb) == null || (string5 = Long.valueOf(sourcePB4.industryId).toString()) == null) {
                    string5 = "";
                }
                c474500IjALIZ.LJJII(string5, "strategy_industry_code");
                RecommendBoardInfo recommendBoardInfo6 = board3.recommendBoardInfo;
                if (recommendBoardInfo6 == null || (sourcePB3 = recommendBoardInfo6.sourcePb) == null || (str = sourcePB3.promptVersion) == null) {
                    str = "";
                }
                c474500IjALIZ.LJJII(str, "prompt_version");
                RecommendBoardInfo recommendBoardInfo7 = board3.recommendBoardInfo;
                if (recommendBoardInfo7 == null || (sourcePB2 = recommendBoardInfo7.sourcePb) == null || (str2 = sourcePB2.industryName) == null) {
                    str2 = "";
                }
                c474500IjALIZ.LJJII(str2, "industry_name");
                RecommendBoardInfo recommendBoardInfo8 = board3.recommendBoardInfo;
                if (recommendBoardInfo8 == null || (sourcePB = recommendBoardInfo8.sourcePb) == null || (str3 = sourcePB.generateVersion) == null) {
                    str3 = "";
                }
                c474500IjALIZ.LJJII(str3, "generate_version");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(String.valueOf(board3.id), "decoration_set_id");
                c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_default");
                RecommendBoardInfo recommendBoardInfo9 = board3.recommendBoardInfo;
                if (recommendBoardInfo9 != null) {
                    objValueOf = Long.valueOf(recommendBoardInfo9.recommendBoardId);
                } else {
                    objValueOf = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(objValueOf, "rec_template_id");
                c474500IjALIZ.LJJII(Integer.valueOf(C752520TfW.LIZ().LIZ), "is_smb_creator");
                c474500IjALIZ.LJJII(Integer.valueOf(arrayList2.size()), "text_item_cnt");
                c474500IjALIZ.LJJIIZ(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(894), 30), "text_item_id_sets", new C5182020e(arrayList2, (List<Function0<Unit>>) 625));
                c474500IjALIZ.LJJII(Integer.valueOf(arrayList4.size()), "board_item_cnt");
                c474500IjALIZ.LJJIIZ(C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(895), 30), "board_item_id_sets", new C5182020e(arrayList4, (List<Function0<Unit>>) 626));
                if (boardItem3 != null) {
                    str4 = "1";
                }
                c474500IjALIZ.LJJII(str4, "has_scenery");
                if (boardItem3 != null && (sceneryContent = boardItem3.sceneryContent) != null && (numValueOf = Integer.valueOf(sceneryContent.sceneryType)) != null) {
                    if (numValueOf.intValue() == 1) {
                        str5 = "top";
                    } else if (numValueOf.intValue() == 3) {
                        str5 = "full_screen";
                    }
                }
                c474500IjALIZ.LJJII(str5, "scenery_layout");
                if (map != null) {
                    c474500IjALIZ.LJJIIZI(map);
                }
                c474500IjALIZ.LJJIJL();
            }
            DataChannel dataChannel = C1814520xJq.LIZJ;
            if (dataChannel != null) {
                dataChannel.zW(PlaybookBoardEntityStatusChannel.class, Boolean.TRUE);
            }
        } else {
            C1814520xJq.LIZIZ.setValue((AbstractC1700910uMb) awS13S0410000_27.l2);
        }
        ((Function1) awS13S0410000_27.l3).invoke(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS13S0410000_27(Board board, Board board2, HashMap<String, String> map, boolean z, AbstractC1700910uMb abstractC1700910uMb, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = board;
        this.l1 = board2;
        this.z4 = map;
        this.l2 = z;
        this.l3 = abstractC1700910uMb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0410000_27(TikTokMediaModel tikTokMediaModel, TakoPhotoChooseViewModel takoPhotoChooseViewModel, boolean z, Fragment fragment, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = tikTokMediaModel;
        this.l1 = takoPhotoChooseViewModel;
        this.z4 = z;
        this.l2 = fragment;
        this.l3 = c19eg;
    }
}
