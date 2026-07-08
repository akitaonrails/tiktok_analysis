package com.bytedance.creativex.model.mapping;

import X.C09CU;
import X.C09DL;
import X.C09FQ;
import X.C234000vK;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class SimpleBundleModelExtraAdapter extends TypeAdapter<Bundle> {
    public final Gson LIZ;
    public final C09FQ LIZIZ;

    @Override // com.google.gson.TypeAdapter
    public final Bundle read(C09CU c09cu) {
        Bundle bundle = new Bundle(SimpleBundleModelExtraAdapter.class.getClassLoader());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            Object objFromJson = GsonProtectorUtils.fromJson(this.LIZ, c09cu.LJJJZ(), (Class<Object>) this.LIZIZ.get(strLJJJJ));
            if (objFromJson == null) {
                C786410Ut5.LJJIZ(bundle, strLJJJJ, null);
            } else if (objFromJson instanceof Parcelable) {
                C786410Ut5.LJJIJL(bundle, strLJJJJ, (Parcelable) objFromJson);
            } else if (objFromJson instanceof Serializable) {
                C786410Ut5.LJJIZ(bundle, strLJJJJ, (Serializable) objFromJson);
            } else if (objFromJson instanceof Byte) {
                bundle.putByte(strLJJJJ, ((Number) objFromJson).byteValue());
            } else if (objFromJson instanceof Character) {
                bundle.putChar(strLJJJJ, ((Character) objFromJson).charValue());
            } else if (objFromJson instanceof Boolean) {
                bundle.putBoolean(strLJJJJ, ((Boolean) objFromJson).booleanValue());
            } else if (objFromJson instanceof Integer) {
                bundle.putInt(strLJJJJ, ((Number) objFromJson).intValue());
            } else if (objFromJson instanceof Short) {
                bundle.putShort(strLJJJJ, ((Number) objFromJson).shortValue());
            } else if (objFromJson instanceof Long) {
                bundle.putLong(strLJJJJ, ((Number) objFromJson).longValue());
            } else if (objFromJson instanceof Float) {
                bundle.putFloat(strLJJJJ, ((Number) objFromJson).floatValue());
            } else if (objFromJson instanceof Double) {
                bundle.putDouble(strLJJJJ, ((Number) objFromJson).doubleValue());
            } else if (objFromJson instanceof String) {
                C786410Ut5.LJJJI(strLJJJJ, (String) objFromJson, bundle);
            } else {
                "type not supported yet".toString();
                throw new IllegalStateException("type not supported yet");
            }
        }
        c09cu.LJII();
        return bundle;
    }

    public SimpleBundleModelExtraAdapter(Gson gson, C234000vK c234000vK) {
        this.LIZ = gson;
        this.LIZIZ = c234000vK;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Bundle bundle) {
        Object obj;
        Bundle bundle2 = bundle;
        c09dl.LIZLLL();
        if (bundle2.getClassLoader() == null) {
            bundle2.setClassLoader(SimpleBundleModelExtraAdapter.class.getClassLoader());
        }
        for (String str : bundle2.keySet()) {
            Class<?> cls = this.LIZIZ.get(str);
            try {
                obj = bundle2.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            c09dl.LJIILLIIL(str);
            c09dl.LJJJJJ(GsonProtectorUtils.toJson(this.LIZ, obj, cls));
        }
        c09dl.LJII();
    }
}
