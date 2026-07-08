package com.google.android.gms.common.server.response;

import X.C0VY8;
import X.C0W3J;
import X.C0W6J;
import X.C1973207oA;
import X.C816410W0x;
import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new Parcelable.Creator<SafeParcelResponse>() { // from class: X.0W69
        @Override // android.os.Parcelable.Creator
        public final SafeParcelResponse createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            Parcel parcelObtain = null;
            zan zanVar = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            zanVar = (zan) C0W6J.LJI(parcel, i, zan.CREATOR);
                        }
                    } else {
                        int iLJJIFFI = C0W6J.LJJIFFI(i, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iLJJIFFI == 0) {
                            parcelObtain = null;
                        } else {
                            parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(parcel, iDataPosition, iLJJIFFI);
                            parcel.setDataPosition(iDataPosition + iLJJIFFI);
                        }
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SafeParcelResponse(iLJIJJLI, parcelObtain, zanVar);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SafeParcelResponse[] newArray(int i) {
            return new SafeParcelResponse[i];
        }
    };
    public final int zaa;
    public final Parcel zab;
    public final int zac;
    public final zan zad;
    public final String zae;
    public int zaf;
    public int zag;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> LIZ() {
        zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        String str = this.zae;
        C0W3J.LJIIIIZZ(str);
        return zanVar.LJLZ(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LIZJ() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean LJ() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel LJII() {
        int i = this.zaf;
        if (i == 0) {
            int iLJJ = C817940W6u.LJJ(20293, this.zab);
            this.zag = iLJJ;
            C817940W6u.LJJI(iLJJ, this.zab);
            this.zaf = 2;
        } else if (i == 1) {
            C817940W6u.LJJI(this.zag, this.zab);
            this.zaf = 2;
        }
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        C0W3J.LJIIIZ(this.zad, "Cannot convert to JSON on client side.");
        Parcel parcelLJII = LJII();
        parcelLJII.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zan zanVar = this.zad;
        String str = this.zae;
        C0W3J.LJIIIIZZ(str);
        Map<String, FastJsonResponse.Field<?, ?>> mapLJLZ = zanVar.LJLZ(str);
        C0W3J.LJIIIIZZ(mapLJLZ);
        LJIIIIZZ(sb, mapLJLZ, parcelLJII);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zan zanVar;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zaa);
        Parcel parcelLJII = LJII();
        if (parcelLJII != null) {
            int iLJJ2 = C817940W6u.LJJ(2, parcel);
            parcel.appendFrom(parcelLJII, 0, parcelLJII.dataSize());
            C817940W6u.LJJI(iLJJ2, parcel);
        }
        int i2 = this.zac;
        if (i2 != 0) {
            if (i2 != 1) {
                zanVar = this.zad;
            } else {
                zanVar = this.zad;
            }
        } else {
            zanVar = null;
        }
        C817940W6u.LJIIZILJ(parcel, 3, zanVar, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        String str;
        this.zaa = i;
        C0W3J.LJIIIIZZ(parcel);
        this.zab = parcel;
        this.zac = 2;
        this.zad = zanVar;
        if (zanVar == null) {
            str = null;
        } else {
            str = zanVar.zac;
        }
        this.zae = str;
        this.zaf = 2;
    }

    public static void LJIIIIZZ(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).zaf, entry);
        }
        sb.append('{');
        int iLJJIII = C0W6J.LJJIII(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iLJJIII) {
            int i = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArrCreateBooleanArray = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArrCreateDoubleArray = null;
                float[] fArrCreateFloatArray = null;
                BigInteger[] bigIntegerArr = null;
                Parcel parcelObtain = null;
                String strEncodeToString = null;
                String strEncodeToString2 = null;
                if (field.LLIFFJFJJ()) {
                    int i2 = field.LLILLL;
                    switch (i2) {
                        case 0:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, Integer.valueOf(C0W6J.LJIJJLI(i, parcel))));
                            break;
                        case 1:
                            int iLJJIFFI = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iLJJIFFI != 0) {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iLJJIFFI);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, bigInteger2));
                            break;
                        case 2:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, Long.valueOf(C0W6J.LJJ(i, parcel))));
                            break;
                        case 3:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, Float.valueOf(C0W6J.LJIJ(i, parcel))));
                            break;
                        case 4:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, Double.valueOf(C0W6J.LJIILLIIL(i, parcel))));
                            break;
                        case 5:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, C0W6J.LIZ(i, parcel)));
                            break;
                        case 6:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, Boolean.valueOf(C0W6J.LJIILIIL(i, parcel))));
                            break;
                        case 7:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, C0W6J.LJII(i, parcel)));
                            break;
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, C0W6J.LIZJ(i, parcel)));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            Bundle bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleLIZIZ.keySet()) {
                                String string = bundleLIZIZ.getString(str2);
                                C0W3J.LJIIIIZZ(string);
                                map2.put(str2, string);
                            }
                            LJIIJ(sb, field, FastJsonResponse.LJFF(field, map2));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i2);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.LLILZ) {
                    sb.append(e3.e);
                    switch (field.LLILLL) {
                        case 0:
                            int[] iArrLIZLLL = C0W6J.LIZLLL(i, parcel);
                            int length = iArrLIZLLL.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Integer.toString(iArrLIZLLL[i3]));
                            }
                            break;
                        case 1:
                            int iLJJIFFI2 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iLJJIFFI2 != 0) {
                                int i4 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i4];
                                for (int i5 = 0; i5 < i4; i5++) {
                                    bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iLJJIFFI2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i6 = 0; i6 < length2; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i6]);
                            }
                            break;
                        case 2:
                            long[] jArrLJFF = C0W6J.LJFF(i, parcel);
                            int length3 = jArrLJFF.length;
                            for (int i7 = 0; i7 < length3; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Long.toString(jArrLJFF[i7]));
                            }
                            break;
                        case 3:
                            int iLJJIFFI3 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iLJJIFFI3 != 0) {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition3 + iLJJIFFI3);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i8 = 0; i8 < length4; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Float.toString(fArrCreateFloatArray[i8]));
                            }
                            break;
                        case 4:
                            int iLJJIFFI4 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iLJJIFFI4 != 0) {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition4 + iLJJIFFI4);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i9 = 0; i9 < length5; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Double.toString(dArrCreateDoubleArray[i9]));
                            }
                            break;
                        case 5:
                            int iLJJIFFI5 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iLJJIFFI5 != 0) {
                                int i10 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i10];
                                for (int i11 = 0; i11 < i10; i11++) {
                                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                    bigDecimalArr[i11] = new BigDecimal(new BigInteger(bArrCreateByteArray2), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition5 + iLJJIFFI5);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i12 = 0; i12 < length6; i12++) {
                                if (i12 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i12]);
                            }
                            break;
                        case 6:
                            int iLJJIFFI6 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iLJJIFFI6 != 0) {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition6 + iLJJIFFI6);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i13 = 0; i13 < length7; i13++) {
                                if (i13 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Boolean.toString(zArrCreateBooleanArray[i13]));
                            }
                            break;
                        case 7:
                            String[] strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
                            int length8 = strArrLJIIIIZZ.length;
                            for (int i14 = 0; i14 < length8; i14++) {
                                if (i14 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArrLJIIIIZZ[i14]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            int iLJJIFFI7 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iLJJIFFI7 != 0) {
                                int i15 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i15];
                                for (int i16 = 0; i16 < i15; i16++) {
                                    int i17 = parcel.readInt();
                                    if (i17 != 0) {
                                        int iDataPosition8 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition8, i17);
                                        parcelArr2[i16] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition8 + i17);
                                    } else {
                                        parcelArr2[i16] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition7 + iLJJIFFI7);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i18 = 0; i18 < length9; i18++) {
                                if (i18 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i18].setDataPosition(0);
                                C0W3J.LJIIIIZZ(field.LLIZ);
                                C0W3J.LJIIIIZZ(field.zaj);
                                Map<String, FastJsonResponse.Field<?, ?>> mapLJLZ = field.zaj.LJLZ(field.LLIZ);
                                C0W3J.LJIIIIZZ(mapLJLZ);
                                LJIIIIZZ(sb, mapLJLZ, parcelArr[i18]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append(e3.f);
                } else {
                    switch (field.LLILLL) {
                        case 0:
                            sb.append(C0W6J.LJIJJLI(i, parcel));
                            break;
                        case 1:
                            int iLJJIFFI8 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition9 = parcel.dataPosition();
                            if (iLJJIFFI8 != 0) {
                                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition9 + iLJJIFFI8);
                                bigInteger = new BigInteger(bArrCreateByteArray3);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(C0W6J.LJJ(i, parcel));
                            break;
                        case 3:
                            sb.append(C0W6J.LJIJ(i, parcel));
                            break;
                        case 4:
                            sb.append(C0W6J.LJIILLIIL(i, parcel));
                            break;
                        case 5:
                            sb.append(C0W6J.LIZ(i, parcel));
                            break;
                        case 6:
                            sb.append(C0W6J.LJIILIIL(i, parcel));
                            break;
                        case 7:
                            String strLJII = C0W6J.LJII(i, parcel);
                            sb.append("\"");
                            sb.append(C0VY8.LIZIZ(strLJII));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrLIZJ = C0W6J.LIZJ(i, parcel);
                            sb.append("\"");
                            if (bArrLIZJ != null) {
                                strEncodeToString2 = Base64.encodeToString(bArrLIZJ, 0);
                            }
                            sb.append(strEncodeToString2);
                            sb.append("\"");
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            byte[] bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                            sb.append("\"");
                            if (bArrLIZJ2 != null) {
                                strEncodeToString = Base64.encodeToString(bArrLIZJ2, 10);
                            }
                            sb.append(strEncodeToString);
                            sb.append("\"");
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            Bundle bundleLIZIZ2 = C0W6J.LIZIZ(i, parcel);
                            Set<String> setKeySet = bundleLIZIZ2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(C0VY8.LIZIZ(bundleLIZIZ2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            int iLJJIFFI9 = C0W6J.LJJIFFI(i, parcel);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iLJJIFFI9 != 0) {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition10, iLJJIFFI9);
                                parcel.setDataPosition(iDataPosition10 + iLJJIFFI9);
                            }
                            parcelObtain.setDataPosition(0);
                            C0W3J.LJIIIIZZ(field.LLIZ);
                            C0W3J.LJIIIIZZ(field.zaj);
                            Map<String, FastJsonResponse.Field<?, ?>> mapLJLZ2 = field.zaj.LJLZ(field.LLIZ);
                            C0W3J.LJIIIIZZ(mapLJLZ2);
                            LJIIIIZZ(sb, mapLJLZ2, parcelObtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == iLJJIII) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(iLJJIII);
        throw new C816410W0x(sb3.toString(), parcel);
    }

    public static final void LJIIIZ(StringBuilder sb, int i, Object obj) {
        String strEncodeToString = null;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C0W3J.LJIIIIZZ(obj);
                sb.append(C0VY8.LIZIZ(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    strEncodeToString = Base64.encodeToString(bArr, 0);
                }
                sb.append(strEncodeToString);
                sb.append("\"");
                return;
            case BdTuring.TYPE_ECAF /* 9 */:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    strEncodeToString = Base64.encodeToString(bArr2, 10);
                }
                sb.append(strEncodeToString);
                sb.append("\"");
                return;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C0W3J.LJIIIIZZ(obj);
                C1973207oA.LIZ(sb, (HashMap) obj);
                return;
            case BdTuring.TYPE_EMAIL /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final void LJIIJ(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.LLILLJJLI) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append(e3.e);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                LJIIIZ(sb, field.LL, ListProtector.get(arrayList, i));
            }
            sb.append(e3.f);
            return;
        }
        LJIIIZ(sb, field.LL, obj);
    }
}
