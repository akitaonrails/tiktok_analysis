package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class ArtistResourceProtocol extends DAVResourceProtocol {
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_ArtistResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.ArtistResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public String getSourceFrom() {
        return DavinciResourceJniJNI.ArtistResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String PARAM_RESOURCE_ID() {
        return DavinciResourceJniJNI.ArtistResourceProtocol_PARAM_RESOURCE_ID();
    }

    public static String PLATFORM_STRING() {
        return DavinciResourceJniJNI.ArtistResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public void finalize() {
        delete();
    }

    public ArtistResourceProtocol(String str) {
        this(DavinciResourceJniJNI.new_ArtistResourceProtocol(str), true);
    }

    public static long getCPtr(ArtistResourceProtocol artistResourceProtocol) {
        if (artistResourceProtocol == null) {
            return 0L;
        }
        return artistResourceProtocol.swigCPtr;
    }

    public static boolean isArtistResource(String str) {
        return DavinciResourceJniJNI.ArtistResourceProtocol_isArtistResource(str);
    }

    public ArtistResourceProtocol(long j, boolean z) {
        super(DavinciResourceJniJNI.ArtistResourceProtocol_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
