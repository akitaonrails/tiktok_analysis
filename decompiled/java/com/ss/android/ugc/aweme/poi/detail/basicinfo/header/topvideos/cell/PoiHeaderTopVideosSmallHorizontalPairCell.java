package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell;

import X.C1173300gdc;
import X.C1174830gg5;
import X.C1180090goZ;
import X.C1180550gpJ;
import X.C1183820gua;
import X.C1185600gxS;
import X.C1187260h08;
import X.C1189060h32;
import X.C1558360qeg;
import X.C2211631BhB;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAwemePictureInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderTopVideosSmallHorizontalPairCell extends PowerCell<C1183820gua> {
    public C1180550gpJ LL;
    public C1180550gpJ LLILLJJLI;
    public View LLILLL;
    public View LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final PoiListApi.PoiDetailResponse I5() {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (interfaceC1181010gq3LIZ2 = C1174830gg5.LIZ(fragmentLJIIJ)) != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ2.qr0()) != null && (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) != null && (poiDetailResponse = c1185600gxS.LJIIIZ) != null) {
            return poiDetailResponse;
        }
        Fragment fragmentLJIIJ2 = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ2 == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ2)) == null) {
            return null;
        }
        return (PoiListApi.PoiDetailResponse) interfaceC1181010gq3LIZ.ta2(new C1180090goZ("poi_head_info"));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = this.itemView.findViewById(R.id.y_h);
        this.LLILZ = this.itemView.findViewById(R.id.cce);
        View view = this.LLILLL;
        this.LL = view != null ? new C1180550gpJ(view) : null;
        View view2 = this.LLILZ;
        this.LLILLJJLI = view2 != null ? new C1180550gpJ(view2) : null;
        View view3 = this.LLILLL;
        if (view3 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 27), view3);
        }
        View view4 = this.LLILZ;
        if (view4 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 28), view4);
        }
        View view5 = this.LLILLL;
        if (view5 != null) {
            C2211631BhB.LJ(view5, new AwS597S0100000_18(this, 307));
        }
        View view6 = this.LLILZ;
        if (view6 != null) {
            C2211631BhB.LJ(view6, new AwS597S0100000_18(this, 308));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.LayoutParams layoutParams;
        C1183820gua c1183820gua = (C1183820gua) interfaceC1891350zJl;
        if (c1183820gua.LLILZ > 0 && c1183820gua.LLILZIL > 0 && (layoutParams = this.itemView.getLayoutParams()) != null) {
            layoutParams.width = c1183820gua.LLILZ;
            layoutParams.height = c1183820gua.LLILZIL;
        }
        C1180550gpJ c1180550gpJ = this.LL;
        if (c1180550gpJ != null) {
            c1180550gpJ.LIZ(c1183820gua.LLILLJJLI);
        }
        C1180550gpJ c1180550gpJ2 = this.LLILLJJLI;
        if (c1180550gpJ2 != null) {
            c1180550gpJ2.LIZ(c1183820gua.LLILLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1n, viewGroup, false);
    }

    public final void N5(PoiListApi.PoiMergedListItem poiMergedListItem, int i) {
        int bindingAdapterPosition;
        String str;
        String str2;
        String string;
        String str3;
        PoiDataStruct poiDataStruct;
        PoiAwemePictureInfo poiAwemePictureInfo;
        PoiAwemePictureInfo poiAwemePictureInfo2;
        Integer num;
        String string2;
        PoiAwemePictureInfo poiAwemePictureInfo3;
        Integer num2;
        PoiAwemePictureInfo poiAwemePictureInfo4;
        PoiAwemePictureInfo poiAwemePictureInfo5;
        Integer num3;
        Aweme aweme = poiMergedListItem.getAweme();
        if (aweme == null) {
            return;
        }
        C1183820gua item = getItem();
        if (item != null && (num3 = item.LLIZ) != null) {
            bindingAdapterPosition = num3.intValue();
        } else {
            bindingAdapterPosition = getBindingAdapterPosition() * 2;
        }
        int i2 = bindingAdapterPosition + i;
        C1187260h08 c1187260h08 = C1187260h08.LIZ;
        String aid = aweme.getAid();
        PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (poiDataStruct2 != null && (poiAwemePictureInfo5 = poiDataStruct2.poiAwemePictureInfo) != null) {
            str = poiAwemePictureInfo5.picId;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(aweme.getAwemeType());
        Integer numValueOf = Integer.valueOf(i2);
        PoiDataStruct poiDataStruct3 = aweme.getPoiDataStruct();
        if (poiDataStruct3 == null || (poiAwemePictureInfo4 = poiDataStruct3.poiAwemePictureInfo) == null || (str2 = poiAwemePictureInfo4.source) == null) {
            str2 = "";
        }
        PoiDataStruct poiDataStruct4 = aweme.getPoiDataStruct();
        if (poiDataStruct4 == null || (poiAwemePictureInfo3 = poiDataStruct4.poiAwemePictureInfo) == null || (num2 = poiAwemePictureInfo3.entityType) == null || (string = num2.toString()) == null) {
            string = "";
        }
        String awemeTopicTagEn = poiMergedListItem.getAwemeTopicTagEn();
        PoiDataStruct poiDataStruct5 = aweme.getPoiDataStruct();
        if (poiDataStruct5 != null && (poiAwemePictureInfo2 = poiDataStruct5.poiAwemePictureInfo) != null && (num = poiAwemePictureInfo2.entityType) != null && (string2 = num.toString()) != null) {
            str4 = string2;
        }
        if (Intrinsics.LJFF(str4, "5") && (poiDataStruct = aweme.getPoiDataStruct()) != null && (poiAwemePictureInfo = poiDataStruct.poiAwemePictureInfo) != null) {
            str3 = poiAwemePictureInfo.entityId;
        } else {
            str3 = null;
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        c1187260h08.getClass();
        C1187260h08.LIZIZ(aid, str, strValueOf, numValueOf, str2, string, awemeTopicTagEn, str3, "multi_media_small", interfaceC665370Q7zLJFF, pageFinderVia);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0209 A[PHI: r12
      0x0209: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v5 java.lang.String) binds: [B:143:0x0205, B:91:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0337 A[PHI: r28
      0x0337: PHI (r28v1 java.lang.String) = (r28v0 java.lang.String), (r28v7 java.lang.String) binds: [B:196:0x0334, B:186:0x02fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x033c A[PHI: r28 r29
      0x033c: PHI (r28v2 java.lang.String) = (r28v1 java.lang.String), (r28v6 java.lang.String) binds: [B:199:0x0339, B:189:0x0302] A[DONT_GENERATE, DONT_INLINE]
      0x033c: PHI (r29v1 java.lang.String) = (r29v0 java.lang.String), (r29v5 java.lang.String) binds: [B:199:0x0339, B:189:0x0302] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0341 A[PHI: r28 r29 r30
      0x0341: PHI (r28v3 java.lang.String) = (r28v2 java.lang.String), (r28v5 java.lang.String) binds: [B:202:0x033e, B:192:0x030a] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r29v2 java.lang.String) = (r29v1 java.lang.String), (r29v4 java.lang.String) binds: [B:202:0x033e, B:192:0x030a] A[DONT_GENERATE, DONT_INLINE]
      0x0341: PHI (r30v1 java.lang.String) = (r30v0 java.lang.String), (r30v3 java.lang.String) binds: [B:202:0x033e, B:192:0x030a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiMergedListItem r33, X.C1183820gua r34, int r35) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.PoiHeaderTopVideosSmallHorizontalPairCell.L5(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem, X.0gua, int):void");
    }
}
