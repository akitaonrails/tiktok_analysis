package ms.bd.o;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes14.dex */
public class r extends SSLSocketFactory {
    static {
        k.a(16777217, 0, 0L, "431dd2", new byte[]{17, 29, 113, 6, 10, 107, 101});
    }

    public r() {
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        throw null;
    }
}
