package io.leason;

/**
 * https://leetcode-cn.com/problems/encode-and-decode-tinyurl/description/
 * <p>
 * TinyURL是一种URL简化服务， 比如：当你输入一个URL https://leetcode.com/problems/design-tinyurl 时，它将返回一个简化的URL
 * http://tinyurl.com/4e9iAk.
 * <p>
 * 要求：设计一个 TinyURL 的加密 encode 和解密 decode 的方法。你的加密和解密算法如何设计和运作是没有限制的， 你只需要保证一个URL可以被加密成一个TinyURL，并且这个TinyURL可以用解密方法恢复成原本的URL。
 */
public class LeetCode0535 {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        for (char c : longUrl.toCharArray()) {
            sb.append((char)(c + 2));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb = new StringBuilder();
        for (char c : shortUrl.toCharArray()) {
            sb.append((char)(c - 2));
        }
        return sb.toString();
    }


}
