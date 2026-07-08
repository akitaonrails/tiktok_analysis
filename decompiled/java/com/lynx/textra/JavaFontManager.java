package com.lynx.textra;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.textra.JavaTypeface;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class JavaFontManager {
    public final long mNativeHandler;
    public final AtomicInteger mCount = new AtomicInteger(0);
    public final LinkedHashMap<JavaTypeface.FontKey, JavaTypeface> mFontMap = new LinkedHashMap<>();
    public final LinkedList<JavaTypeface> mFontList = new LinkedList<>();

    private native void BindNativeInstance(long j, JavaFontManager javaFontManager);

    private native long CreateNativeTypeface(long j);

    public long GetNativeHandler() {
        return this.mNativeHandler;
    }

    public JavaFontManager(long j) {
        this.mNativeHandler = j;
    }

    public synchronized JavaTypeface GetTypefaceByIndex(int i) {
        for (JavaTypeface javaTypeface : this.mFontMap.values()) {
            if (javaTypeface.mIndex == i) {
                return javaTypeface;
            }
        }
        for (JavaTypeface javaTypeface2 : this.mFontList) {
            if (javaTypeface2.mIndex == i) {
                return javaTypeface2;
            }
        }
        return null;
    }

    public long onMatchTypefaceIndex(long j) {
        return GetTypefaceByIndex((int) j).mNativeHandler;
    }

    public synchronized JavaTypeface RegisterShapeFont(Font font, JavaTypeface.FontKey fontKey) {
        JavaTypeface javaTypeface;
        javaTypeface = this.mFontMap.get(fontKey);
        if (javaTypeface == null) {
            javaTypeface = new JavaTypeface(this.mCount.incrementAndGet(), font, fontKey, CreateNativeTypeface(this.mNativeHandler));
            this.mFontMap.put(fontKey, javaTypeface);
        }
        return javaTypeface;
    }

    private synchronized JavaTypeface RegisterTypeface(Typeface typeface, JavaTypeface.FontKey fontKey, long j) {
        return new JavaTypeface(this.mCount.incrementAndGet(), typeface, fontKey, j);
    }

    public synchronized JavaTypeface CreateOrRegisterTypeface(Typeface typeface, String str, int i, boolean z) {
        JavaTypeface javaTypefaceRegisterTypeface;
        JavaTypeface.FontKey fontKey = new JavaTypeface.FontKey();
        if (str != null && !str.isEmpty()) {
            fontKey.mFontFamily = str;
        }
        fontKey.mFontWeight = i;
        fontKey.mItalic = z;
        javaTypefaceRegisterTypeface = this.mFontMap.get(fontKey);
        if (javaTypefaceRegisterTypeface == null) {
            javaTypefaceRegisterTypeface = RegisterTypeface(typeface, fontKey, CreateNativeTypeface(this.mNativeHandler));
        } else if (javaTypefaceRegisterTypeface.mTypeface != typeface) {
            this.mFontList.add(javaTypefaceRegisterTypeface);
            javaTypefaceRegisterTypeface = RegisterTypeface(typeface, fontKey, CreateNativeTypeface(this.mNativeHandler));
        }
        this.mFontMap.put(fontKey, javaTypefaceRegisterTypeface);
        return javaTypefaceRegisterTypeface;
    }

    public synchronized long onMatchFamilyStyle(String str, int i, boolean z, long j) {
        int i2;
        JavaTypeface first;
        long j2;
        JavaTypeface.FontKey fontKey = new JavaTypeface.FontKey();
        if (str != null && !str.isEmpty()) {
            fontKey.mFontFamily = str;
        }
        fontKey.mFontWeight = i;
        fontKey.mItalic = z;
        JavaTypeface javaTypeface = this.mFontMap.get(fontKey);
        if (javaTypeface != null) {
            return javaTypeface.mNativeHandler;
        }
        fontKey.mFontFamily = "";
        JavaTypeface javaTypeface2 = this.mFontMap.get(fontKey);
        if (javaTypeface2 != null) {
            return javaTypeface2.mNativeHandler;
        }
        if (i >= 700) {
            if (z) {
                i2 = 3;
            } else {
                i2 = 1;
            }
        } else if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        try {
            Typeface typefaceCreate = Typeface.create(Typeface.DEFAULT, i2);
            if (typefaceCreate == null) {
                typefaceCreate = Typeface.DEFAULT;
            }
            first = RegisterTypeface(typefaceCreate, fontKey, j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (first.mNativeHandler == 0) {
            if (!this.mFontMap.isEmpty()) {
                first = this.mFontMap.values().iterator().next();
            } else {
                if (!this.mFontList.isEmpty()) {
                    first = this.mFontList.getFirst();
                }
                j2 = this.mNativeHandler;
                return j2;
            }
            if (first != null) {
            }
            j2 = this.mNativeHandler;
            return j2;
        }
        this.mFontMap.put(fontKey, first);
        j2 = first.mNativeHandler;
        return j2;
    }
}
