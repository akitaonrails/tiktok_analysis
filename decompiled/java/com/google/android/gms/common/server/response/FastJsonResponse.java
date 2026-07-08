package com.google.android.gms.common.server.response;

import X.C0VY8;
import X.C0W3J;
import X.C0W3L;
import X.C0W6A;
import X.C0W6C;
import X.C0WZX;
import X.C1973207oA;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C0W6A CREATOR = new Parcelable.Creator<Field>() { // from class: X.0W6A
            @Override // android.os.Parcelable.Creator
            public final FastJsonResponse.Field createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                String strLJII = null;
                int iLJIJJLI = 0;
                int iLJIJJLI2 = 0;
                boolean zLJIILIIL = false;
                int iLJIJJLI3 = 0;
                boolean zLJIILIIL2 = false;
                int iLJIJJLI4 = 0;
                String strLJII2 = null;
                zaa zaaVar = null;
                while (parcel.dataPosition() < iLJJIII) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            break;
                        case 2:
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                            break;
                        case 3:
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 4:
                            iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                            break;
                        case 5:
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case 6:
                            strLJII = C0W6J.LJII(i, parcel);
                            break;
                        case 7:
                            iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                            break;
                        case '\b':
                            strLJII2 = C0W6J.LJII(i, parcel);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            zaaVar = (zaa) C0W6J.LJI(parcel, i, zaa.CREATOR);
                            break;
                        default:
                            C0W6J.LJJII(i, parcel);
                            break;
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new FastJsonResponse.Field(iLJIJJLI, iLJIJJLI2, zLJIILIIL, iLJIJJLI3, zLJIILIIL2, strLJII, iLJIJJLI4, strLJII2, zaaVar);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FastJsonResponse.Field[] newArray(int i) {
                return new FastJsonResponse.Field[i];
            }
        };
        public final int LL;
        public final boolean LLILLJJLI;
        public final int LLILLL;
        public final boolean LLILZ;
        public final String LLILZIL;
        public final Class<? extends FastJsonResponse> LLILZLL;
        public final String LLIZ;
        public final int zaf;
        public final int zai;
        public zan zaj;
        public C0W6C<I, O> zak;

        public final boolean LLIFFJFJJ() {
            return this.zak != null;
        }

        public final String toString() {
            C0W3L c0w3l = new C0W3L(this);
            c0w3l.LIZ(Integer.valueOf(this.zai), "versionCode");
            c0w3l.LIZ(Integer.valueOf(this.LL), "typeIn");
            c0w3l.LIZ(Boolean.valueOf(this.LLILLJJLI), "typeInArray");
            c0w3l.LIZ(Integer.valueOf(this.LLILLL), "typeOut");
            c0w3l.LIZ(Boolean.valueOf(this.LLILZ), "typeOutArray");
            c0w3l.LIZ(this.LLILZIL, "outputFieldName");
            c0w3l.LIZ(Integer.valueOf(this.zaf), "safeParcelFieldId");
            String str = this.LLIZ;
            if (str == null) {
                str = null;
            }
            c0w3l.LIZ(str, "concreteTypeName");
            Class<? extends FastJsonResponse> cls = this.LLILZLL;
            if (cls != null) {
                c0w3l.LIZ(cls.getCanonicalName(), "concreteType.class");
            }
            C0W6C<I, O> c0w6c = this.zak;
            if (c0w6c != null) {
                c0w3l.LIZ(c0w6c.getClass().getCanonicalName(), "converterName");
            }
            return c0w3l.toString();
        }

        public final I LLI(O o) {
            C0W3J.LJIIIIZZ(this.zak);
            return (I) ((StringToIntConverter) this.zak).LJLZ(o);
        }

        public static Field LJLZ(int i, String str) {
            return new Field(7, true, 7, true, str, i, null);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iLJJ = C817940W6u.LJJ(20293, parcel);
            C817940W6u.LJIIJ(parcel, 1, this.zai);
            C817940W6u.LJIIJ(parcel, 2, this.LL);
            C817940W6u.LIZ(parcel, 3, this.LLILLJJLI);
            C817940W6u.LJIIJ(parcel, 4, this.LLILLL);
            C817940W6u.LIZ(parcel, 5, this.LLILZ);
            C817940W6u.LJIJ(parcel, 6, this.LLILZIL, false);
            C817940W6u.LJIIJ(parcel, 7, this.zaf);
            String str = this.LLIZ;
            zaa zaaVar = null;
            if (str == null) {
                str = null;
            }
            C817940W6u.LJIJ(parcel, 8, str, false);
            C0W6C<I, O> c0w6c = this.zak;
            if (c0w6c != null) {
                if (c0w6c instanceof StringToIntConverter) {
                    zaaVar = new zaa((StringToIntConverter) c0w6c);
                } else {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
            }
            C817940W6u.LJIIZILJ(parcel, 9, zaaVar, i, false);
            C817940W6u.LJJI(iLJJ, parcel);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.zai = 1;
            this.LL = i;
            this.LLILLJJLI = z;
            this.LLILLL = i2;
            this.LLILZ = z2;
            this.LLILZIL = str;
            this.zaf = i3;
            this.LLILZLL = cls;
            if (cls == null) {
                this.LLIZ = null;
            } else {
                this.LLIZ = cls.getCanonicalName();
            }
            this.zak = null;
        }

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
            this.zai = i;
            this.LL = i2;
            this.LLILLJJLI = z;
            this.LLILLL = i3;
            this.LLILZ = z2;
            this.LLILZIL = str;
            this.zaf = i4;
            if (str2 == null) {
                this.LLILZLL = null;
                this.LLIZ = null;
            } else {
                this.LLILZLL = SafeParcelResponse.class;
                this.LLIZ = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.LJLZ();
            }
        }
    }

    public abstract Map<String, Field<?, ?>> LIZ();

    public abstract Object LIZJ();

    public abstract boolean LJ();

    public String toString() {
        Map<String, Field<?, ?>> mapLIZ = LIZ();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapLIZ.keySet()) {
            Field<?, ?> field = mapLIZ.get(str);
            if (LIZLLL(field)) {
                Object objLJFF = LJFF(field, LIZIZ(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objLJFF != null) {
                    switch (field.LLILLL) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objLJFF, 0));
                            sb.append("\"");
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objLJFF, 10));
                            sb.append("\"");
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            C1973207oA.LIZ(sb, (HashMap) objLJFF);
                            break;
                        default:
                            if (field.LLILLJJLI) {
                                ArrayList arrayList = (ArrayList) objLJFF;
                                sb.append(e3.e);
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = ListProtector.get(arrayList, i);
                                    if (obj != null) {
                                        LJI(sb, field, obj);
                                    }
                                }
                                sb.append(e3.f);
                            } else {
                                LJI(sb, field, objLJFF);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public Object LIZIZ(Field field) {
        boolean z;
        String str = field.LLILZIL;
        if (field.LLILZLL != null) {
            if (LIZJ() == null) {
                z = true;
            } else {
                z = false;
            }
            Object[] objArr = {field.LLILZIL};
            if (z) {
                try {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String strSubstring = str.substring(1);
                    StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 4);
                    sb.append("get");
                    sb.append(upperCase);
                    sb.append(strSubstring);
                    return C2204961BRm.a0(getClass().getMethod(sb.toString(), new Class[0]), this, new Object[0], new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCIrq/NMiZEbkC0bQzNZGyduW6bhm4oFQWQRFYf6Y/O2E=", new String[]{"016a9"}));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
            throw new IllegalStateException(C786410Ut5.j4("Concrete field shouldn't be value object: %s", objArr));
        }
        return LIZJ();
    }

    public boolean LIZLLL(Field field) {
        if (field.LLILLL == 11) {
            if (field.LLILZ) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <O, I> I LJFF(Field<I, O> field, Object obj) {
        if (field.zak != null) {
            return field.LLI(obj);
        }
        return obj;
    }

    public static final void LJI(StringBuilder sb, Field field, Object obj) {
        int i = field.LL;
        if (i != 11) {
            if (i == 7) {
                sb.append("\"");
                sb.append(C0VY8.LIZIZ((String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
            return;
        }
        Class<? extends FastJsonResponse> cls = field.LLILZLL;
        C0W3J.LJIIIIZZ(cls);
        sb.append(cls.cast(obj).toString());
    }
}
