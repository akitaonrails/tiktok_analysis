package com.ss.android.ugc.aweme.theater.social.protocol;

import X.C01GW;
import X.C03IT;
import X.C0MU2;
import X.C0MXG;
import X.C0MXJ;
import X.C0MXL;
import X.C0MXP;
import X.C0MXX;
import X.C0MXY;
import X.C0MXZ;
import X.C0ZHB;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13BV;
import X.C13LP;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C452501pT;
import X.C461530I7z;
import X.C549720LhC;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC427850Gq7;
import X.InterfaceC550020Lhg;
import X.InterfaceC558600LvW;
import X.InterfaceC712990Rxx;
import Y.ACListenerS75S0300000_8;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.tools.chat.data.Avatar;
import com.ss.android.ugc.tools.chat.data.CameoMentionInfo;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;
import com.ss.android.ugc.tools.chat.data.ImageBlock;
import com.ss.android.ugc.tools.chat.data.ImageThumb;
import com.ss.android.ugc.tools.chat.data.TaskInfo;
import com.ss.android.ugc.tools.chat.data.UserBaseInfo;
import com.ss.android.ugc.tools.chat.data.VideoBlock;
import com.ss.android.ugc.tools.chat.data.VideoCardContent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterSocialGeneratedReusedUISlot extends ReusedUISlotAssem<AITheaterSocialGeneratedReusedUISlot> implements InterfaceC712990Rxx<C0MXL> {
    public final InterfaceC550020Lhg LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.nj;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SmartImageView op() {
        return (SmartImageView) this.LLJL.getValue();
    }

    public AITheaterSocialGeneratedReusedUISlot() {
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        this.LLJJLIIIJLLLLLLLZ = iAITheaterFeatureServiceLIZ != null ? iAITheaterFeatureServiceLIZ.LJIIIZ() : null;
        this.LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 458));
        this.LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 457));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C786410Ut5.Q8(op(), null);
        ((C0MXY) this.LLJLIL.getValue()).setConfig(new C0MXX());
        ((C0MXY) this.LLJLIL.getValue()).LIZIZ();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C786410Ut5.Q8(op(), null);
        ((C0MXY) this.LLJLIL.getValue()).setConfig(new C0MXX());
        ((C0MXY) this.LLJLIL.getValue()).LIZIZ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [X.0MXY] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0MXX] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final void up(final C0MXL c0mxl) {
        int iIntValue;
        ?? arrayList;
        int iLJIJI;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        VideoCardContent videoCardContent;
        List<VideoBlock> list;
        VideoBlock videoBlock;
        List<CameoMentionInfo> list2;
        Avatar avatar;
        ImageThumb imageThumb;
        List<String> list3;
        Object objLJJJLL;
        Integer numLIZJ;
        List<VideoBlock> list4;
        VideoBlock videoBlock2;
        ImageBlock imageBlock;
        List<String> list5;
        String str;
        String str2;
        final IcAigcCommonMessageCard icAigcCommonMessageCardLJJIII = c0mxl.LJJIII();
        int iIntValue2 = 0;
        final String str3 = null;
        if (icAigcCommonMessageCardLJJIII != null) {
            TaskInfo taskInfo = icAigcCommonMessageCardLJJIII.taskInfo;
            if (taskInfo != null && (str = taskInfo.taskId) != null && C0MXG.LIZIZ(null, str, 1) != 2 && C0MXG.LIZIZ(null, str, 1) != 3 && (c0mxl instanceof C0MXP)) {
                InterfaceC550020Lhg interfaceC550020Lhg = this.LLJJLIIIJLLLLLLLZ;
                if (interfaceC550020Lhg != null) {
                    interfaceC550020Lhg.LIZ(str, C2097608Jq.LJIIJ(new Pair("msg_scene", "generated_message_send"), new Pair("message_uuid", c0mxl.LLILII().LIZ.LIZ.getUuid())));
                }
                C0MXG.LJ(2, null, str);
                TaskInfo taskInfo2 = icAigcCommonMessageCardLJJIII.taskInfo;
                C0MU2 c0mu2 = C0MU2.LIZ;
                String uuid = c0mxl.LLILII().LIZ.LIZ.getUuid();
                String strValueOf = String.valueOf(c0mxl.LLILII().LIZ.LIZ.getMsgId());
                if (taskInfo2 != null) {
                    str2 = taskInfo2.clientTaskId;
                } else {
                    str2 = null;
                }
                c0mu2.getClass();
                C0MU2.LJFF(1, 0, uuid, strValueOf, str2);
            }
            VideoCardContent videoCardContent2 = icAigcCommonMessageCardLJJIII.videoCardContent;
            if (videoCardContent2 != null && (list4 = videoCardContent2.video) != null && (videoBlock2 = (VideoBlock) C13LP.LJJJLL(list4)) != null && (imageBlock = videoBlock2.cover) != null && (list5 = imageBlock.urlList) != null) {
                str3 = (String) C13LP.LJJJLL(list5);
            }
        }
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(12);
        C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.z_, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setColor(iIntValue);
        if (str3 != null && str3.length() != 0) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str3)));
            c1331670kl3LJIIJ.LJJI = c1331730kl9;
            c1331670kl3LJIIJ.LJJ(op());
            c1331670kl3LJIIJ.LJJIIZI(gradientDrawable);
            c1331670kl3LJIIJ.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0MUR
                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    String str4;
                    C0MU2 c0mu22 = C0MU2.LIZ;
                    String uuid2 = C0I6Y.LIZ(c0mxl).getUuid();
                    String strValueOf2 = String.valueOf(C0I6Y.LIZ(c0mxl).getMsgId());
                    TaskInfo taskInfo3 = icAigcCommonMessageCardLJJIII.taskInfo;
                    String message = null;
                    if (taskInfo3 != null) {
                        str4 = taskInfo3.clientTaskId;
                    } else {
                        str4 = null;
                    }
                    String str5 = str3;
                    if (th != null) {
                        message = th.getMessage();
                    }
                    Long lValueOf = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                    c0mu22.getClass();
                    List<InterfaceC2342209Fs> list6 = C2341909Fp.LIZ;
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("message_id", uuid2);
                    c0lab.LJ("server_message_id", strValueOf2);
                    c0lab.LJ("local_task_id", str4);
                    c0lab.LJ("url", str5);
                    c0lab.LIZLLL(0, "is_success");
                    c0lab.LJ("error_info", message);
                    c0lab.LIZLLL(lValueOf, "duration");
                    c0lab.LIZ(1, "is_end");
                    c0lab.LIZIZ(System.currentTimeMillis(), "time_stamp");
                    C2341909Fp.LIZ("ai_theater_social_video_show", c0lab.LIZ);
                }
            });
        } else {
            op().setPlaceholderImage(gradientDrawable);
        }
        SmartImageView smartImageViewOp = op();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(12));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, op().getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        gradientDrawable2.setStroke(iLIZIZ, iIntValue2);
        smartImageViewOp.setBackground(gradientDrawable2);
        op().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        C786410Ut5.Q8(op(), new ACListenerS75S0300000_8(this, c0mxl, icAigcCommonMessageCardLJJIII, 2));
        if (icAigcCommonMessageCardLJJIII != null && (videoCardContent = icAigcCommonMessageCardLJJIII.videoCardContent) != null && (list = videoCardContent.video) != null && (videoBlock = (VideoBlock) C13LP.LJJJLL(list)) != null && (list2 = videoBlock.cameoInfos) != null) {
            arrayList = new ArrayList();
            Iterator<CameoMentionInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                UserBaseInfo userBaseInfo = it2.next().userBaseInfo;
                if (userBaseInfo != null && (avatar = userBaseInfo.avatar) != null && (imageThumb = avatar.imageThumb) != null && (list3 = imageThumb.urlList) != null && (objLJJJLL = C13LP.LJJJLL(list3)) != null) {
                    arrayList.add(objLJJJLL);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null) {
            iLJIJI = interfaceC558600LvWLIZIZ.LJIJI();
        } else {
            iLJIJI = 3;
        }
        ?? c0mxx = new C0MXX();
        c0mxx.avatars(arrayList);
        c0mxx.avatarSizeDp(28);
        c0mxx.hollowContentSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        c0mxx.hollowIconSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        c0mxx.hollowOffsetPx(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.37d))), -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.09d))));
        c0mxx.showLimit(iLJIJI);
        c0mxx.outlineWidthPx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c0mxx.overlapSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.53d))));
        c0mxx.extraViewType(new C0MXZ(iLJIJI) { // from class: X.0MXU
        });
        c0mxx.build();
        ((C0MXY) this.LLJLIL.getValue()).LIZ(c0mxx);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0MXL c0mxl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0MXL c0mxl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0MXJ c0mxj;
        C0MXL c0mxl = (C0MXL) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0MXJ) && (c0mxj = (C0MXJ) obj2) != null && c0mxj.LIZ) {
                    up(c0mxl);
                }
            }
            return;
        }
        up(c0mxl);
    }
}
