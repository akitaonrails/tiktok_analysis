package com.ss.android.ugc.aweme.pcs.course.managementpage.vm;

import X.AbstractC489130JGd;
import X.C08XD;
import X.C09JN;
import X.C0JDS;
import X.C0JDY;
import X.C0JH1;
import X.C0JHC;
import X.C0JHG;
import X.C0JMD;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1701940uOG;
import X.C1808280x9m;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C470590Icr;
import X.C480460Ism;
import X.C488550JDx;
import X.C489170JGh;
import X.C489180JGi;
import X.C717610SCx;
import X.C717620SCy;
import X.EnumC1379590m0L;
import X.EnumC489120JGc;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC489200JGk;
import X.InterfaceC665370Q7z;
import Y.AComparatorS506S0100000_7;
import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.PriceTier;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS22S0010000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game.GameDrawerCategory;
import webcast.api.smb.DiscardSMBCourseChangesRequest;
import webcast.api.smb.DiscardSMBCourseChangesResponse;
import webcast.api.smb.GetSMBCourseDetailResponse;
import webcast.api.smb.UpdateSMBCourseReq;
import webcast.api.smb.UpdateSMBCourseResp;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseManageVM extends AssemViewModel<C488550JDx> implements IPcsCourseManageVmAbility {
    public Boolean LLILLJJLI;
    public Boolean LLILLL;
    public C0JHC LLILZIL;
    public boolean LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public IPcsCourseNameVAbility LLIZLLLIL;
    public IPcsCourseDescVAbility LLJ;
    public C0JHG LLJI;
    public final List<String> LL = new ArrayList();
    public final C11NJ LLILZ = new C11NJ();

    @Override // com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseManageVmAbility
    public final PcsCourseManageVM oL() {
        return this;
    }

    public final boolean CQ2() {
        String strKb1;
        SMBCourse sMBCourse;
        ContentAuditStatus contentAuditStatus;
        String str = null;
        if (this.LLIZLLLIL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLIZ;
            this.LLIZLLLIL = interfaceC665370Q7z != null ? (IPcsCourseNameVAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCourseNameVAbility.class, null) : null;
        }
        IPcsCourseNameVAbility iPcsCourseNameVAbility = this.LLIZLLLIL;
        if (iPcsCourseNameVAbility == null || (strKb1 = iPcsCourseNameVAbility.kb1()) == null) {
            strKb1 = "";
        }
        GetSMBCourseDetailResponse.Data data = getState().LLILLJJLI;
        if (data != null && (sMBCourse = data.course) != null && (contentAuditStatus = sMBCourse.name) != null) {
            str = contentAuditStatus.content;
        }
        return !Intrinsics.LJFF(strKb1, str);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C488550JDx(0);
    }

    public final IPcsCourseDescVAbility yQ2() {
        if (this.LLJ == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLIZ;
            this.LLJ = interfaceC665370Q7z != null ? (IPcsCourseDescVAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCourseDescVAbility.class, null) : null;
        }
        return this.LLJ;
    }

    public final C0JHC zQ2() {
        if (this.LLILZIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLILZIL = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILZIL;
    }

    public final boolean AQ2() {
        Iterator<T> it2 = getState().LLILLL.LIZ.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((InterfaceC489200JGk) next).LJIIIIZZ() == C0JH1.UPLOAD_IN_PROGRESS) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean BQ2() {
        SMBCourse sMBCourse;
        List<SMBCourseVideo> list;
        GetSMBCourseDetailResponse.Data data = getState().LLILLJJLI;
        if (data == null || (sMBCourse = data.course) == null || (list = sMBCourse.videoList) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (SMBCourseVideo sMBCourseVideo : list) {
            if (sMBCourseVideo.audioReviewResult == 3) {
                arrayList.add(sMBCourseVideo);
            }
        }
        return arrayList.isEmpty() ^ true;
    }

    public final void EQ2() {
        String str;
        Long l;
        Long l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" request /webcast/smb/paid_video/detail/ userId:");
        C0JHC c0jhcZQ2 = zQ2();
        sbLIZ.append(c0jhcZQ2 != null ? c0jhcZQ2.LL : null);
        sbLIZ.append(", serviceId:");
        C0JHC c0jhcZQ22 = zQ2();
        sbLIZ.append(c0jhcZQ22 != null ? c0jhcZQ22.LLILLJJLI : null);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(AFwS237S0000000_7.get$arr$(158));
        C480460Ism.LIZ().getClass();
        IPcsCourseApi iPcsCourseApi = (IPcsCourseApi) C480460Ism.LIZLLL(IPcsCourseApi.class);
        C0JHC c0jhcZQ23 = zQ2();
        long jLongValue = 0;
        long jLongValue2 = (c0jhcZQ23 == null || (l2 = c0jhcZQ23.LL) == null) ? 0L : l2.longValue();
        C0JHC c0jhcZQ24 = zQ2();
        if (c0jhcZQ24 != null && (l = c0jhcZQ24.LLILLJJLI) != null) {
            jLongValue = l.longValue();
        }
        C11NZ<C470590Icr<GetSMBCourseDetailResponse.Data>> c11nzLoadCourseDetail = iPcsCourseApi.loadCourseDetail(jLongValue2, jLongValue, 1, "");
        C0JHC c0jhcZQ25 = zQ2();
        if (c0jhcZQ25 == null || (str = c0jhcZQ25.LLILLL) == null) {
            str = "";
        }
        this.LLILZ.LIZ(C1808280x9m.LJFF(c11nzLoadCourseDetail, str, "/smb/course/detail/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 118), new AfS176S0100000_7(this, 119)));
    }

    public final List<InterfaceC489200JGk> getVideoList() {
        return getState().LLILLL.LIZ;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZ.LJ();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    public static void IQ2(InterfaceC489200JGk interfaceC489200JGk) {
        EditPostPermission editPostPermission = new EditPostPermission(Collections.singletonList(new EditPostBizPermissionStruct(EnumC1379590m0L.TEXT.getValue(), C0JMD.GRAYED_OUT_FOR_MODERATION.getValue())));
        Aweme awemeLJIJJLI = interfaceC489200JGk.LJIJJLI();
        if (awemeLJIJJLI != null) {
            awemeLJIJJLI.setEditPostPermission(editPostPermission);
        }
    }

    public static EnumC489120JGc wQ2(Aweme aweme) {
        EditPostPermission editPostPermission;
        List<EditPostBizPermissionStruct> list;
        if (aweme != null && (editPostPermission = aweme.getEditPostPermission()) != null && (list = editPostPermission.bizPermission) != null) {
            ArrayList arrayList = new ArrayList();
            for (EditPostBizPermissionStruct editPostBizPermissionStruct : list) {
                EditPostBizPermissionStruct editPostBizPermissionStruct2 = editPostBizPermissionStruct;
                if (editPostBizPermissionStruct2.bizType == EnumC1379590m0L.TEXT.getValue() || editPostBizPermissionStruct2.bizType == EnumC1379590m0L.COVER.getValue()) {
                    arrayList.add(editPostBizPermissionStruct);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((EditPostBizPermissionStruct) it2.next()).bizStatus));
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() != C0JMD.SHOW.getValue()) {
                        if (arrayList2.contains(Integer.valueOf(C0JMD.GRAYED_OUT_FOR_MODERATION.getValue()))) {
                            return EnumC489120JGc.GRAY_OUT_FOR_UNDER_REVIEW;
                        }
                        if (arrayList2.contains(Integer.valueOf(C0JMD.GRAYED_OUT_FOR_FREQ_CONTROL.getValue()))) {
                            return EnumC489120JGc.GRAY_OUT_FOR_FREQUENCY_CONTROL;
                        }
                        if (arrayList2.contains(Integer.valueOf(C0JMD.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue()))) {
                            return EnumC489120JGc.GRAY_OUT_FOR_TIME_EXPIRATION;
                        }
                        return EnumC489120JGc.GRAY_OUT_UNKNOWN_REASON;
                    }
                }
            }
            return EnumC489120JGc.CAN_EDIT;
        }
        return EnumC489120JGc.GRAY_OUT_UNKNOWN_REASON;
    }

    public final void DQ2(C0JDY c0jdy) {
        LinkedHashMap linkedHashMap;
        String strKb1;
        String strI90;
        long jLongValue;
        String str;
        Long l;
        IPcsCourseNameVAbility iPcsCourseNameVAbility;
        List<Long> list = getState().LLILZLL;
        if (list != null) {
            C717620SCy c717620SCyLLIIL = C13LP.LLIIL(list);
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iLIZIZ);
            Iterator it2 = c717620SCyLLIIL.iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (!c717610SCx.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                Pair pair = new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        List<InterfaceC489200JGk> list2 = getState().LLILLL.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((InterfaceC489200JGk) obj).LJIIIIZZ().isUploaded()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((InterfaceC489200JGk) it3.next()).LJ(true)));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (arrayList3.size() > 1) {
            C08XD.LJJ(arrayList3, new AComparatorS506S0100000_7(linkedHashMap, 2));
        }
        if (this.LLIZLLLIL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLIZ;
            if (interfaceC665370Q7z != null) {
                iPcsCourseNameVAbility = (IPcsCourseNameVAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCourseNameVAbility.class, null);
            } else {
                iPcsCourseNameVAbility = null;
            }
            this.LLIZLLLIL = iPcsCourseNameVAbility;
        }
        IPcsCourseNameVAbility iPcsCourseNameVAbility2 = this.LLIZLLLIL;
        String str2 = "";
        if (iPcsCourseNameVAbility2 == null || (strKb1 = iPcsCourseNameVAbility2.kb1()) == null) {
            strKb1 = "";
        }
        IPcsCourseDescVAbility iPcsCourseDescVAbilityYQ2 = yQ2();
        if (iPcsCourseDescVAbilityYQ2 == null || (strI90 = iPcsCourseDescVAbilityYQ2.I90()) == null) {
            strI90 = "";
        }
        String strLIZ = C0JDS.LIZ(getState());
        UpdateSMBCourseReq updateSMBCourseReq = new UpdateSMBCourseReq();
        C0JHC c0jhcZQ2 = zQ2();
        long j = 0;
        if (c0jhcZQ2 != null && (l = c0jhcZQ2.LLILLJJLI) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        updateSMBCourseReq.courseId = jLongValue;
        updateSMBCourseReq.name = strKb1;
        updateSMBCourseReq.description = strI90;
        updateSMBCourseReq.pinText = strLIZ;
        PriceTier priceTier = getState().LLILZIL;
        if (priceTier != null) {
            j = priceTier.priceTierGrade;
        }
        updateSMBCourseReq.priceTier = j;
        updateSMBCourseReq.publishedVideoIds = arrayList3;
        updateSMBCourseReq.deletedVideoIds = getState().LLILZ;
        C480460Ism.LIZ().getClass();
        C11NZ<C470590Icr<UpdateSMBCourseResp.Data>> c11nzUpdateCourse = ((IPcsCourseApi) C480460Ism.LIZLLL(IPcsCourseApi.class)).updateCourse(updateSMBCourseReq);
        C0JHC c0jhcZQ22 = zQ2();
        if (c0jhcZQ22 != null && (str = c0jhcZQ22.LLILLL) != null) {
            str2 = str;
        }
        this.LLILZ.LIZ(C1808280x9m.LJFF(c11nzUpdateCourse, str2, "/smb/course/update/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0200000_7((Object) this, (EmoteModel) c0jdy, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 12), new AfS176S0100000_7(c0jdy, 117)));
    }

    public final void FQ2(boolean z) {
        setState(new AwS22S0010000_7(0));
    }

    public final void GQ2(AbstractC489130JGd abstractC489130JGd) {
        setState(new AwS586S0100000_7(abstractC489130JGd, 255));
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseManageVmAbility
    public final void VO2(InterfaceC489200JGk interfaceC489200JGk) {
        boolean zIsUploaded = interfaceC489200JGk.LJIIIIZZ().isUploaded();
        AwS251S0300000_7 awS251S0300000_7 = new AwS251S0300000_7((List) getState().LLILLL.LIZ, (List<InterfaceC489200JGk>) interfaceC489200JGk, (InterfaceC489200JGk) this, (PcsCourseManageVM) 9);
        if (zIsUploaded) {
            long jLJ = interfaceC489200JGk.LJ(true);
            List<Long> list = getState().LLILZ;
            list.add(Long.valueOf(jLJ));
            setState(new AwS586S0100000_7((List) list, (List<GameDrawerCategory>) 436));
        }
        awS251S0300000_7.invoke();
    }

    public final void vQ2(C0JHG c0jhg) {
        if (c0jhg == null) {
            return;
        }
        List<InterfaceC489200JGk> list = getState().LLILLL.LIZ;
        AbstractC489130JGd abstractC489130JGd = getState().LL;
        abstractC489130JGd.getClass();
        if (!(abstractC489130JGd instanceof C489180JGi) && !(abstractC489130JGd instanceof C489170JGh)) {
            this.LLJI = c0jhg;
        } else {
            list.add(c0jhg);
            setState(new AwS586S0100000_7((List) list, (List<GameDrawerCategory>) 440));
        }
        FQ2(true);
    }

    public final void xQ2(Function0<Unit> function0) {
        long jLongValue;
        String str;
        Long l;
        DiscardSMBCourseChangesRequest discardSMBCourseChangesRequest = new DiscardSMBCourseChangesRequest();
        C0JHC c0jhcZQ2 = zQ2();
        if (c0jhcZQ2 != null && (l = c0jhcZQ2.LLILLJJLI) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        discardSMBCourseChangesRequest.courseId = jLongValue;
        C480460Ism.LIZ().getClass();
        C11NZ<C470590Icr<DiscardSMBCourseChangesResponse>> c11nzDiscardCourseChanges = ((IPcsCourseApi) C480460Ism.LIZLLL(IPcsCourseApi.class)).discardCourseChanges(discardSMBCourseChangesRequest);
        C0JHC c0jhcZQ22 = zQ2();
        if (c0jhcZQ22 == null || (str = c0jhcZQ22.LLILLL) == null) {
            str = "";
        }
        this.LLILZ.LIZ(C1808280x9m.LJFF(c11nzDiscardCourseChanges, str, "/smb/course/discard_changes/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(function0, 116), new C09JN() { // from class: X.0JDf
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PcsCourseManageVM@778d.discardNonSubmittedVideos$2");
                C1C7U.LIZIZ("PcsCourseManageVM@778d.discardNonSubmittedVideos$2");
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb A[PHI: r1
      0x00cb: PHI (r1v2 boolean) = (r1v1 boolean), (r1v3 boolean) binds: [B:20:0x0040, B:38:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HQ2(X.InterfaceC489200JGk r8, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM.HQ2(X.0JGk, kotlin.jvm.functions.Function1):void");
    }
}
