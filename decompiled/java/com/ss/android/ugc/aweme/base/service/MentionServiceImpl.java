package com.ss.android.ugc.aweme.base.service;

import X.C0AMS;
import X.C0DXR;
import X.C0DXS;
import X.C0P0T;
import X.C1163430gNh;
import X.C1348740lCa;
import X.C1356630lPJ;
import X.C1563370qml;
import X.C19628911qx;
import X.C199Y;
import X.C19EG;
import X.C20612815lG;
import X.C20613015lI;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2226708nx;
import X.C2246331Cw3;
import X.C298620BnA;
import X.C316410Cal;
import X.C450860Hm8;
import X.C451210Hmh;
import X.C723850SaN;
import X.EnumC1235690iGF;
import X.EnumC682280QpW;
import X.InterfaceC1348870lCn;
import X.InterfaceC1356670lPN;
import X.InterfaceC20613315lL;
import X.InterfaceC316600Cb4;
import Y.ARunnableS64S0300000_31;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.ui.cell.GroupMentionCell;
import com.ss.android.ugc.aweme.base.ui.cell.SkeletonStickerCell;
import com.ss.android.ugc.aweme.business.bio.cell.ProfileBioMentionCell;
import com.ss.android.ugc.aweme.business.caption.cell.TextCaptionMentionCell;
import com.ss.android.ugc.aweme.business.comment.assem.CommentMentionPanelAssem;
import com.ss.android.ugc.aweme.business.comment.cell.CommentMentionVerticalCell;
import com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell;
import com.ss.android.ugc.aweme.business.repost.cell.RepostMentionVerticalCell;
import com.ss.android.ugc.aweme.business.sticker.assem.CommonHorizontalContainerAssem;
import com.ss.android.ugc.aweme.business.sticker.cell.MentionStickerCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.service.IMentionService;
import com.ss.android.ugc.aweme.service.MentionListCellStyle;
import com.ss.android.ugc.gamora.editor.audioservice.service.debugtool.SamiDebugToolServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS150S0201000_31;
import kotlin.jvm.internal.AwS53S0301000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionServiceImpl implements IMentionService {
    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final int LJI() {
        return R.layout.dlw;
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC316600Cb4 LJIIIIZZ() {
        return C2226708nx.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final MentionRecommendResponse LJFF(MentionRecommendQueryRequest mentionRecommendQueryRequest) {
        C316410Cal.LIZ.getClass();
        return C316410Cal.LIZIZ(mentionRecommendQueryRequest);
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LIZJ(C2246331Cw3 c2246331Cw3, UIAssem uIAssem) {
        CommonHorizontalContainerAssem commonHorizontalContainerAssem = new CommonHorizontalContainerAssem();
        C20613015lI c20613015lI = new C20613015lI();
        C20612815lG c20612815lG = c20613015lI.LIZ;
        c20612815lG.LIZIZ = true;
        c20612815lG.LIZJ = "profile_bio";
        c20612815lG.LJII = c2246331Cw3;
        c20613015lI.LIZIZ(ProfileBioMentionCell.class);
        C20612815lG c20612815lG2 = c20613015lI.LIZ;
        c20612815lG2.LIZ = 1;
        c20612815lG2.LJ = 0;
        if (C0AMS.LIZ()) {
            C20612815lG c20612815lG3 = c20613015lI.LIZ;
            c20612815lG3.LJFF = 3;
            c20612815lG3.LJIILIIL = SkeletonStickerCell.class;
            c20612815lG3.LJIILJJIL = R.attr.a01;
        } else {
            c20613015lI.LIZ.LJFF = 2;
        }
        c20613015lI.LIZ.LJIIJ = Integer.valueOf(R.layout.dlv);
        commonHorizontalContainerAssem.LLJJI = c20613015lI.LIZ();
        C723850SaN.LIZLLL(uIAssem, new AwS112S0201000_31(uIAssem, commonHorizontalContainerAssem, 2));
        return commonHorizontalContainerAssem;
    }

    public static C20612815lG LJIIJ(String str, Map map, InterfaceC20613315lL interfaceC20613315lL) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("enter_from", str);
        C20613015lI c20613015lI = new C20613015lI();
        C20612815lG c20612815lG = c20613015lI.LIZ;
        c20612815lG.LIZIZ = false;
        c20612815lG.LIZJ = "comment";
        c20612815lG.LIZLLL = linkedHashMap;
        c20612815lG.LJII = interfaceC20613315lL;
        c20612815lG.LJFF = 2;
        c20612815lG.LJIIIIZZ = true;
        c20613015lI.LIZIZ(GroupMentionCell.class, CommentMentionVerticalCell.class);
        C20612815lG c20612815lG2 = c20613015lI.LIZ;
        c20612815lG2.LIZ = 2;
        c20612815lG2.LJ = 1;
        c20613015lI.LIZ.LJIIIZ = new C0DXS();
        return c20613015lI.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1348870lCn LIZIZ(String str, Map map, C1348740lCa c1348740lCa, Fragment fragment, C1163430gNh c1163430gNh) {
        CommentMentionPanelAssem commentMentionPanelAssem = new CommentMentionPanelAssem();
        commentMentionPanelAssem.LLJJI = LJIIJ(str, map, c1348740lCa);
        C723850SaN.LIZ(fragment, false, null, new AwS53S0301000_31(fragment, commentMentionPanelAssem, c1163430gNh, 0), 3);
        return commentMentionPanelAssem;
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final C0P0T LJ(Context context, PointF pointF, String str, String str2, View.OnClickListener onClickListener) {
        C450860Hm8 c450860Hm8 = new C450860Hm8(context);
        c450860Hm8.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
        c450860Hm8.LIZ((int) pointF.x, (int) pointF.y);
        c450860Hm8.LJIIJ(new C451210Hmh(str, onClickListener, str2, context));
        return c450860Hm8.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1348870lCn LJII(String str, Map map, InterfaceC20613315lL interfaceC20613315lL, UIAssem uIAssem, C1163430gNh c1163430gNh) {
        CommentMentionPanelAssem commentMentionPanelAssem = new CommentMentionPanelAssem();
        commentMentionPanelAssem.LLJJI = LJIIJ(str, map, interfaceC20613315lL);
        C723850SaN.LIZLLL(uIAssem, new AwS53S0301000_31(uIAssem, commentMentionPanelAssem, c1163430gNh, 1));
        return commentMentionPanelAssem;
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LIZLLL(String str, C1356630lPJ c1356630lPJ, UIAssem uIAssem, int i, int i2, String str2) {
        CommonHorizontalContainerAssem commonHorizontalContainerAssem = new CommonHorizontalContainerAssem();
        C20613015lI c20613015lI = new C20613015lI();
        C20612815lG c20612815lG = c20613015lI.LIZ;
        c20612815lG.LIZIZ = false;
        c20612815lG.LIZJ = "repost_text";
        c20612815lG.LJIIL = str2;
        c20612815lG.LJII = c1356630lPJ;
        c20612815lG.LJIIIIZZ = true;
        c20613015lI.LIZ.LIZLLL = C2097908Jt.LIZJ(new Pair("enter_from", str));
        if (i2 == 1) {
            c20613015lI.LIZIZ(RepostMentionVerticalCell.class);
            C20612815lG c20612815lG2 = c20613015lI.LIZ;
            c20612815lG2.LIZ = 2;
            c20612815lG2.LJ = 1;
            c20612815lG2.LJFF = 2;
            c20612815lG2.LJIIJ = Integer.valueOf(R.layout.dm1);
            c20613015lI.LIZ.LJIIIZ = new C0DXS();
        } else {
            c20613015lI.LIZIZ(RepostMentionHorizontalCell.class);
            C20612815lG c20612815lG3 = c20613015lI.LIZ;
            c20612815lG3.LIZ = 1;
            c20612815lG3.LJ = 0;
            c20612815lG3.LJFF = 3;
            c20612815lG3.LJIIJ = Integer.valueOf(R.layout.dm0);
            c20613015lI.LIZ.LJIIIZ = new C0DXR() { // from class: X.0DX0
                public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        int itemCount = adapter.getItemCount();
                        boolean zLIZJ = C444960Hcc.LIZJ(view.getContext());
                        if (childAdapterPosition == 0) {
                            if (zLIZJ) {
                                rect.right = LLILLJJLI;
                                rect.left = LL;
                                return;
                            } else {
                                rect.left = LLILLJJLI;
                                rect.right = LL;
                                return;
                            }
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            if (zLIZJ) {
                                rect.left = LLILLJJLI;
                                return;
                            } else {
                                rect.right = LLILLJJLI;
                                return;
                            }
                        }
                        if (zLIZJ) {
                            rect.left = LL;
                        } else {
                            rect.right = LL;
                        }
                    }
                }
            };
        }
        commonHorizontalContainerAssem.LLJJI = c20613015lI.LIZ();
        C723850SaN.LIZLLL(uIAssem, new AwS112S0201000_31(uIAssem, i, commonHorizontalContainerAssem, 3));
        return commonHorizontalContainerAssem;
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LIZ(C19628911qx c19628911qx, C19EG c19eg, ViewGroup viewGroup, String str, String str2, String str3, boolean z) {
        CommonHorizontalContainerAssem commonHorizontalContainerAssem = new CommonHorizontalContainerAssem();
        C20613015lI c20613015lI = new C20613015lI();
        C20612815lG c20612815lG = c20613015lI.LIZ;
        c20612815lG.LIZIZ = true;
        c20612815lG.LIZJ = "sticker";
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "video_edit_page"), new Pair("previous_page", "video_post_page"), new Pair("enter_type", "sticker"), new Pair("userId", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId()), new Pair("appId", SamiDebugToolServiceImpl.LIZ().getAppId()));
        if (str != null) {
            mapLJIIJ.put("shoot_way", str);
        }
        mapLJIIJ.put("content_source", str2);
        if (str3 != null) {
            mapLJIIJ.put("content_type", str3);
        }
        C20612815lG c20612815lG2 = c20613015lI.LIZ;
        c20612815lG2.LIZLLL = mapLJIIJ;
        c20612815lG2.LJII = c19628911qx;
        c20613015lI.LIZIZ(MentionStickerCell.class);
        C20612815lG c20612815lG3 = c20613015lI.LIZ;
        c20612815lG3.LIZ = 1;
        c20612815lG3.LJ = 0;
        if (C0AMS.LIZ()) {
            C20612815lG c20612815lG4 = c20613015lI.LIZ;
            c20612815lG4.LJFF = 3;
            c20612815lG4.LJIILIIL = SkeletonStickerCell.class;
        } else {
            c20613015lI.LIZ.LJFF = 0;
        }
        c20613015lI.LIZ.LJIIJJI = z;
        commonHorizontalContainerAssem.LLJJI = c20613015lI.LIZ();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(View.generateViewId());
        viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
        HandlerHook.viewPost(viewGroup, new ARunnableS64S0300000_31(c19eg, commonHorizontalContainerAssem, frameLayout, 0));
        return commonHorizontalContainerAssem;
    }

    @Override // com.ss.android.ugc.aweme.service.IMentionService
    public final InterfaceC1356670lPN LJIIIZ(InterfaceC20613315lL interfaceC20613315lL, C19EG c19eg, int i, String str, String str2, String str3, String str4, String str5, boolean z, Boolean bool, MentionListCellStyle mentionListCellStyle) {
        Map<String, String> extraParams;
        String str6;
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19eg, 231);
        if (c19eg instanceof C199Y) {
            C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new AwS575S0100000_31(awS575S0100000_31, (Function0<Unit>) 12));
        } else {
            awS575S0100000_31.invoke();
        }
        CommonHorizontalContainerAssem commonHorizontalContainerAssem = new CommonHorizontalContainerAssem();
        C20613015lI c20613015lI = new C20613015lI();
        C20612815lG c20612815lG = c20613015lI.LIZ;
        c20612815lG.LIZIZ = true;
        c20612815lG.LIZJ = "text_caption";
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "video_edit_page"), new Pair("previous_page", "video_post_page"), new Pair("enter_type", "caption_mode"), new Pair("userId", str), new Pair("appId", str2));
        if (str3 != null) {
            mapLJIIJ.put("shoot_way", str3);
        }
        if (str4 != null) {
            mapLJIIJ.put("content_source", str4);
        }
        if (str5 != null) {
            mapLJIIJ.put("content_type", str5);
        }
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIIJ.put("is_note", str6);
        }
        if (C298620BnA.LIZ() && mentionListCellStyle != null && (extraParams = mentionListCellStyle.toExtraParams()) != null) {
            for (Map.Entry<String, String> entry : extraParams.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value != null) {
                    mapLJIIJ.put(key, value);
                }
            }
        }
        C20612815lG c20612815lG2 = c20613015lI.LIZ;
        c20612815lG2.LIZLLL = mapLJIIJ;
        c20612815lG2.LJII = interfaceC20613315lL;
        c20613015lI.LIZIZ(TextCaptionMentionCell.class);
        C20612815lG c20612815lG3 = c20613015lI.LIZ;
        c20612815lG3.LIZ = 1;
        c20612815lG3.LJ = 0;
        if (C0AMS.LIZ()) {
            C20612815lG c20612815lG4 = c20613015lI.LIZ;
            c20612815lG4.LJFF = 3;
            c20612815lG4.LJIILIIL = SkeletonStickerCell.class;
        } else {
            c20613015lI.LIZ.LJFF = 0;
        }
        c20613015lI.LIZ.LJIIJJI = z;
        commonHorizontalContainerAssem.LLJJI = c20613015lI.LIZ();
        try {
            AwS150S0201000_31 awS150S0201000_31 = new AwS150S0201000_31(c19eg, i, commonHorizontalContainerAssem, 1);
            if (c19eg instanceof C199Y) {
                C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new AwS575S0100000_31(awS150S0201000_31, (Function0<Unit>) 12));
                return commonHorizontalContainerAssem;
            }
            awS150S0201000_31.invoke();
            return commonHorizontalContainerAssem;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return commonHorizontalContainerAssem;
        }
    }
}
