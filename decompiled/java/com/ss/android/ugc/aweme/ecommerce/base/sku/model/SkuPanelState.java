package com.ss.android.ugc.aweme.ecommerce.base.sku.model;

import X.C04AW;
import X.C09CT;
import X.C968903qZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecipientInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelState implements Parcelable, Cloneable {

    @C09CT("back_to_pdp")
    public boolean backToPdp;

    @C09CT("bill_info_repo_id")
    public String billInfoRepoId;

    @C09CT("cart_item_id")
    public String cartItemId;

    @C09CT("checked_sku_ids")
    public String[] checkedSkuIds;

    @C09CT("click_image_source")
    public ImageSelectData clickImageSource;

    @C09CT("click_spec_group_ids")
    public ArrayList<Integer> clickSpecGroupIds;

    @C09CT("close_from")
    public int closeFrom;

    @C09CT("default_pre_select_sku_ids")
    public String[] defaultPreSelectSkuIds;

    @C09CT("default_pre_select_type")
    public String defaultPreSelectType;

    @C09CT("exception_ux")
    public ExceptionUX exceptionUX;

    @C09CT("free_shipping")
    public Integer freeShipping;

    @C09CT("installment_plan")
    public InstallmentPlan installmentPlan;

    @C09CT("is_default_pre_select")
    public Integer isDefaultPreSelect;

    @C09CT("is_sku_manually_selected")
    public Boolean isSkuManuallySelected;

    @C09CT("link")
    public String link;

    @C09CT("payment_module_cache")
    public final Map<String, PdpPaymentModule> paymentModuleCache;

    @C09CT("period_text")
    public String periodText;

    @C09CT("product_id")
    public final String productId;

    @C09CT("quantity")
    public Integer productQuantity;

    @C09CT("purchase_method")
    public Integer purchaseMethod;

    @C09CT("recipient_info")
    public RecipientInfo recipientInfo;

    @C09CT("selected_insurance_info")
    public InsuranceInfo selectedInsuranceInfo;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("start_buy_now_click_time")
    public Long startBuyNowClickTime;

    @C09CT("voucher_info")
    public SkuVoucher voucherInfo;

    @C09CT("warehouse_id")
    public String warehouseId;
    public static final Parcelable.Creator<SkuPanelState> CREATOR = new Parcelable.Creator<SkuPanelState>() { // from class: X.03p2
        @Override // android.os.Parcelable.Creator
        public final SkuPanelState createFromParcel(Parcel parcel) {
            SkuVoucher skuVoucherCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            ImageSelectData imageSelectDataCreateFromParcel;
            ArrayList arrayList;
            Long lValueOf;
            InstallmentPlan installmentPlanCreateFromParcel;
            Integer numValueOf3;
            LinkedHashMap linkedHashMap;
            Integer numValueOf4;
            boolean z2;
            Boolean boolValueOf;
            RecipientInfo recipientInfoCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                skuVoucherCreateFromParcel = null;
            } else {
                skuVoucherCreateFromParcel = SkuVoucher.CREATOR.createFromParcel(parcel);
            }
            SkuVoucher skuVoucher = skuVoucherCreateFromParcel;
            String[] strArrCreateStringArray = parcel.createStringArray();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            ExceptionUX exceptionUX = (ExceptionUX) parcel.readParcelable(SkuPanelState.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                imageSelectDataCreateFromParcel = null;
            } else {
                imageSelectDataCreateFromParcel = ImageSelectData.CREATOR.createFromParcel(parcel);
            }
            ImageSelectData imageSelectData = imageSelectDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                installmentPlanCreateFromParcel = null;
            } else {
                installmentPlanCreateFromParcel = InstallmentPlan.CREATOR.createFromParcel(parcel);
            }
            InstallmentPlan installmentPlan = installmentPlanCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashMap.put(parcel.readString(), PdpPaymentModule.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            String string8 = parcel.readString();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            InsuranceInfo insuranceInfo = (InsuranceInfo) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                recipientInfoCreateFromParcel = null;
            } else {
                recipientInfoCreateFromParcel = RecipientInfo.CREATOR.createFromParcel(parcel);
            }
            return new SkuPanelState(string, string2, string3, skuVoucher, strArrCreateStringArray, numValueOf, numValueOf2, string4, z, i, exceptionUX, string5, imageSelectData, arrayList, lValueOf, installmentPlan, numValueOf3, string6, string7, linkedHashMap, numValueOf4, string8, strArrCreateStringArray2, boolValueOf, insuranceInfo, recipientInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuPanelState[] newArray(int i) {
            return new SkuPanelState[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SkuPanelState(productId=" + this.productId + ", skuId=" + this.skuId + ", warehouseId=" + this.warehouseId + ", voucherInfo=" + this.voucherInfo + ", checkedSkuIds=" + Arrays.toString(this.checkedSkuIds) + ", productQuantity=" + this.productQuantity + ", purchaseMethod=" + this.purchaseMethod + ", periodText=" + this.periodText + ", backToPdp=" + this.backToPdp + ", closeFrom=" + this.closeFrom + ", exceptionUX=" + this.exceptionUX + ", link=" + this.link + ", clickImageSource=" + this.clickImageSource + ", clickSpecGroupIds=" + this.clickSpecGroupIds + ", startBuyNowClickTime=" + this.startBuyNowClickTime + ", installmentPlan=" + this.installmentPlan + ", freeShipping=" + this.freeShipping + ", cartItemId=" + this.cartItemId + ", billInfoRepoId=" + this.billInfoRepoId + ", paymentModuleCache=" + this.paymentModuleCache + ", isDefaultPreSelect=" + this.isDefaultPreSelect + ", defaultPreSelectType=" + this.defaultPreSelectType + ", defaultPreSelectSkuIds=" + Arrays.toString(this.defaultPreSelectSkuIds) + ", isSkuManuallySelected=" + this.isSkuManuallySelected + ", selectedInsuranceInfo=" + this.selectedInsuranceInfo + ", recipientInfo=" + this.recipientInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.skuId);
        parcel.writeString(this.warehouseId);
        SkuVoucher skuVoucher = this.voucherInfo;
        if (skuVoucher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuVoucher.writeToParcel(parcel, i);
        }
        parcel.writeStringArray(this.checkedSkuIds);
        Integer num = this.productQuantity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.purchaseMethod;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.periodText);
        parcel.writeInt(this.backToPdp ? 1 : 0);
        parcel.writeInt(this.closeFrom);
        parcel.writeParcelable(this.exceptionUX, i);
        parcel.writeString(this.link);
        ImageSelectData imageSelectData = this.clickImageSource;
        if (imageSelectData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageSelectData.writeToParcel(parcel, i);
        }
        ArrayList<Integer> arrayList = this.clickSpecGroupIds;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Integer> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        Long l = this.startBuyNowClickTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        InstallmentPlan installmentPlan = this.installmentPlan;
        if (installmentPlan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentPlan.writeToParcel(parcel, i);
        }
        Integer num3 = this.freeShipping;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.cartItemId);
        parcel.writeString(this.billInfoRepoId);
        Map<String, PdpPaymentModule> map = this.paymentModuleCache;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, PdpPaymentModule> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        Integer num4 = this.isDefaultPreSelect;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.defaultPreSelectType);
        parcel.writeStringArray(this.defaultPreSelectSkuIds);
        Boolean bool = this.isSkuManuallySelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeSerializable(this.selectedInsuranceInfo);
        RecipientInfo recipientInfo = this.recipientInfo;
        if (recipientInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recipientInfo.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final SkuPanelState clone() {
        String str = this.productId;
        String str2 = this.skuId;
        String str3 = this.warehouseId;
        SkuVoucher skuVoucher = this.voucherInfo;
        String[] strArr = this.checkedSkuIds;
        return new SkuPanelState(str, str2, str3, skuVoucher, strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : null, this.productQuantity, this.purchaseMethod, this.periodText, this.backToPdp, 0, null, this.link, this.clickImageSource, this.clickSpecGroupIds, null, this.installmentPlan, this.freeShipping, this.cartItemId, null, this.paymentModuleCache, this.isDefaultPreSelect, this.defaultPreSelectType, this.defaultPreSelectSkuIds, this.isSkuManuallySelected, this.selectedInsuranceInfo, this.recipientInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LIZJ() {
        /*
            r10 = this;
            java.lang.String[] r0 = r10.defaultPreSelectSkuIds
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L1e
            java.lang.Object r1 = X.C13LQ.LJJIIZ(r6, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1e
            int r0 = r1.length()
            if (r0 <= 0) goto L1e
            java.lang.String[] r0 = r10.checkedSkuIds
            if (r0 == 0) goto L59
            int r0 = X.C13LQ.LJJIJIIJI(r1, r0)
            if (r0 < 0) goto L59
        L1e:
            r9 = 1
        L1f:
            java.lang.String[] r0 = r10.defaultPreSelectSkuIds
            if (r0 == 0) goto L3b
            java.lang.Object r1 = X.C13LQ.LJJIIZ(r5, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3b
            int r0 = r1.length()
            if (r0 <= 0) goto L3b
            java.lang.String[] r0 = r10.checkedSkuIds
            if (r0 == 0) goto L57
            int r0 = X.C13LQ.LJJIJIIJI(r1, r0)
            if (r0 < 0) goto L57
        L3b:
            r8 = 1
        L3c:
            java.lang.String[] r7 = r10.defaultPreSelectSkuIds
            if (r7 == 0) goto L7d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r3 = r7.length
            r2 = 0
        L47:
            if (r2 >= r3) goto L5b
            r1 = r7[r2]
            int r0 = r1.length()
            if (r0 <= 0) goto L54
            r4.add(r1)
        L54:
            int r2 = r2 + 1
            goto L47
        L57:
            r8 = 0
            goto L3c
        L59:
            r9 = 0
            goto L1f
        L5b:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L7d
            java.util.Iterator r2 = r4.iterator()
        L65:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r1 = r2.next()
            java.lang.String[] r0 = r10.checkedSkuIds
            if (r0 != 0) goto L75
            java.lang.String[] r0 = new java.lang.String[r6]
        L75:
            int r0 = X.C13LQ.LJJIJIIJI(r1, r0)
            if (r0 >= 0) goto L65
            r4 = 0
            goto L7e
        L7d:
            r4 = 1
        L7e:
            r0 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_proceed_default_first_attr"
            r1.<init>(r0, r2)
            r3[r6] = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_proceed_default_second_attr"
            r1.<init>(r0, r2)
            r3[r5] = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_proceed_default"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState.LIZJ():java.util.Map");
    }

    public final int hashCode() {
        String[] strArr = this.checkedSkuIds;
        int iHashCode = (strArr != null ? Arrays.hashCode(strArr) : 0) * 31;
        Integer num = this.productQuantity;
        return ((iHashCode + (num != null ? num.intValue() : 0)) * 31) + this.productId.hashCode();
    }

    public final SkuItem LIZLLL(List<SkuItem> list) {
        String[] strArr;
        if (list == null || (strArr = this.checkedSkuIds) == null) {
            return null;
        }
        return (SkuItem) C04AW.LJ(C968903qZ.LIZ(strArr), list);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(SkuPanelState.class, cls)) {
            return false;
        }
        SkuPanelState skuPanelState = (SkuPanelState) obj;
        String[] strArr = this.checkedSkuIds;
        if (strArr != null) {
            String[] strArr2 = skuPanelState.checkedSkuIds;
            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (skuPanelState.checkedSkuIds != null) {
            return false;
        }
        if (Intrinsics.LJFF(this.productQuantity, skuPanelState.productQuantity) && Intrinsics.LJFF(this.productId, skuPanelState.productId)) {
            return true;
        }
        return false;
    }

    public static SkuPanelState LIZIZ(SkuPanelState skuPanelState, String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, Integer num2, String str4, boolean z, int i, ExceptionUX exceptionUX, Long l, InstallmentPlan installmentPlan, String str5, Map map, InsuranceInfo insuranceInfo, int i2) {
        String str6;
        ImageSelectData imageSelectData;
        ArrayList<Integer> arrayList;
        Integer num3;
        String str7;
        Integer num4;
        String str8;
        String[] strArr2;
        Boolean bool;
        InsuranceInfo insuranceInfo2 = insuranceInfo;
        Map map2 = map;
        String str9 = str5;
        Long l2 = l;
        ExceptionUX exceptionUX2 = exceptionUX;
        int i3 = i;
        InstallmentPlan installmentPlan2 = installmentPlan;
        boolean z2 = z;
        String str10 = str4;
        Integer num5 = num2;
        Integer num6 = num;
        String[] strArr3 = strArr;
        SkuVoucher skuVoucher2 = skuVoucher;
        String str11 = str3;
        String str12 = str2;
        String str13 = str;
        if ((i2 & 1) != 0) {
            str13 = skuPanelState.productId;
        }
        if ((i2 & 2) != 0) {
            str12 = skuPanelState.skuId;
        }
        if ((i2 & 4) != 0) {
            str11 = skuPanelState.warehouseId;
        }
        if ((i2 & 8) != 0) {
            skuVoucher2 = skuPanelState.voucherInfo;
        }
        if ((i2 & 16) != 0) {
            strArr3 = skuPanelState.checkedSkuIds;
        }
        if ((i2 & 32) != 0) {
            num6 = skuPanelState.productQuantity;
        }
        if ((i2 & 64) != 0) {
            num5 = skuPanelState.purchaseMethod;
        }
        if ((i2 & 128) != 0) {
            str10 = skuPanelState.periodText;
        }
        if ((i2 & 256) != 0) {
            z2 = skuPanelState.backToPdp;
        }
        if ((i2 & 512) != 0) {
            i3 = skuPanelState.closeFrom;
        }
        if ((i2 & 1024) != 0) {
            exceptionUX2 = skuPanelState.exceptionUX;
        }
        RecipientInfo recipientInfo = null;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = skuPanelState.link;
        } else {
            str6 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            imageSelectData = skuPanelState.clickImageSource;
        } else {
            imageSelectData = null;
        }
        if ((i2 & 8192) != 0) {
            arrayList = skuPanelState.clickSpecGroupIds;
        } else {
            arrayList = null;
        }
        if ((i2 & 16384) != 0) {
            l2 = skuPanelState.startBuyNowClickTime;
        }
        if ((32768 & i2) != 0) {
            installmentPlan2 = skuPanelState.installmentPlan;
        }
        if ((65536 & i2) != 0) {
            num3 = skuPanelState.freeShipping;
        } else {
            num3 = null;
        }
        if ((131072 & i2) != 0) {
            str7 = skuPanelState.cartItemId;
        } else {
            str7 = null;
        }
        if ((262144 & i2) != 0) {
            str9 = skuPanelState.billInfoRepoId;
        }
        if ((524288 & i2) != 0) {
            map2 = skuPanelState.paymentModuleCache;
        }
        if ((1048576 & i2) != 0) {
            num4 = skuPanelState.isDefaultPreSelect;
        } else {
            num4 = null;
        }
        if ((2097152 & i2) != 0) {
            str8 = skuPanelState.defaultPreSelectType;
        } else {
            str8 = null;
        }
        if ((4194304 & i2) != 0) {
            strArr2 = skuPanelState.defaultPreSelectSkuIds;
        } else {
            strArr2 = null;
        }
        if ((8388608 & i2) != 0) {
            bool = skuPanelState.isSkuManuallySelected;
        } else {
            bool = null;
        }
        if ((16777216 & i2) != 0) {
            insuranceInfo2 = skuPanelState.selectedInsuranceInfo;
        }
        if ((i2 & 33554432) != 0) {
            recipientInfo = skuPanelState.recipientInfo;
        }
        skuPanelState.getClass();
        return new SkuPanelState(str13, str12, str11, skuVoucher2, strArr3, num6, num5, str10, z2, i3, exceptionUX2, str6, imageSelectData, arrayList, l2, installmentPlan2, num3, str7, str9, map2, num4, str8, strArr2, bool, insuranceInfo2, recipientInfo);
    }

    public SkuPanelState(String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, Integer num2, String str4, boolean z, int i, ExceptionUX exceptionUX, String str5, ImageSelectData imageSelectData, ArrayList<Integer> arrayList, Long l, InstallmentPlan installmentPlan, Integer num3, String str6, String str7, Map<String, PdpPaymentModule> map, Integer num4, String str8, String[] strArr2, Boolean bool, InsuranceInfo insuranceInfo, RecipientInfo recipientInfo) {
        this.productId = str;
        this.skuId = str2;
        this.warehouseId = str3;
        this.voucherInfo = skuVoucher;
        this.checkedSkuIds = strArr;
        this.productQuantity = num;
        this.purchaseMethod = num2;
        this.periodText = str4;
        this.backToPdp = z;
        this.closeFrom = i;
        this.exceptionUX = exceptionUX;
        this.link = str5;
        this.clickImageSource = imageSelectData;
        this.clickSpecGroupIds = arrayList;
        this.startBuyNowClickTime = l;
        this.installmentPlan = installmentPlan;
        this.freeShipping = num3;
        this.cartItemId = str6;
        this.billInfoRepoId = str7;
        this.paymentModuleCache = map;
        this.isDefaultPreSelect = num4;
        this.defaultPreSelectType = str8;
        this.defaultPreSelectSkuIds = strArr2;
        this.isSkuManuallySelected = bool;
        this.selectedInsuranceInfo = insuranceInfo;
        this.recipientInfo = recipientInfo;
    }
}
